/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.tutorial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * Utility class to unzip one or more projects contained in plugins.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 3.2
 */
public class AcceleoProjectUnzipper extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String parameter = event.getParameter("org.eclipse.acceleo.tutorial.projectUnzipperPath");
		String path = "invalid";

		if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-1/".equals(parameter)) {
			path = "step-1";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-2/".equals(parameter)) {
			path = "step-2";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-3/".equals(parameter)) {
			path = "step-3";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-4/".equals(parameter)) {
			path = "step-4";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-5/".equals(parameter)) {
			path = "step-5";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-6/".equals(parameter)) {
			path = "step-6";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-7/".equals(parameter)) {
			path = "step-7";
		} else if ("platform:/plugin/org.eclipse.acceleo.tutorial/step-8/".equals(parameter)) {
			path = "step-8";
		}

		Bundle bundle = Platform.getBundle("org.eclipse.acceleo.tutorial");
		Enumeration<URL> entries = bundle.findEntries(path, "*.zip", false);
		while (entries.hasMoreElements()) {
			URL nextElement = entries.nextElement();

			String projectName = nextElement.toString();
			projectName = projectName.substring(projectName.lastIndexOf("/"));
			if (projectName.endsWith(".zip")) {
				projectName = projectName.substring(0, projectName.length() - ".zip".length());
			}
			try {
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (project.exists()) {
					return null;
				}
				try {
					project.create(new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}

				final String regexedProjectName = projectName.replaceAll("\\.", "\\."); //$NON-NLS-1$ //$NON-NLS-2$

				final ZipInputStream zipFileStream = new ZipInputStream(nextElement.openStream());
				ZipEntry zipEntry = zipFileStream.getNextEntry();

				while (zipEntry != null) {
					// We will construct the new file but we will strip off the project
					// directory from the beginning of the path because we have already
					// created the destination project for this zip.
					final File file = new File(project.getLocation().toString(), zipEntry.getName()
							.replaceFirst("^" + regexedProjectName + "/", "")); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$

					if (!zipEntry.isDirectory()) {

						/*
						 * Copy files (and make sure parent directory exist)
						 */
						final File parentFile = file.getParentFile();
						if (null != parentFile && !parentFile.exists()) {
							parentFile.mkdirs();
						}

						OutputStream os = null;

						try {
							os = new FileOutputStream(file);

							final int bufferSize = 102400;
							final byte[] buffer = new byte[bufferSize];
							while (true) {
								final int len = zipFileStream.read(buffer);
								if (zipFileStream.available() == 0) {
									break;
								}
								os.write(buffer, 0, len);
							}
						} finally {
							if (null != os) {
								os.close();
							}
						}
					}

					zipFileStream.closeEntry();
					zipEntry = zipFileStream.getNextEntry();
				}

				try {
					project.open(new NullProgressMonitor());
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
