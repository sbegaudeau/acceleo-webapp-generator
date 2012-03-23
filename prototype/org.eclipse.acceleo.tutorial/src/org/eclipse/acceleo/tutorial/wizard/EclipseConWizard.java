package org.eclipse.acceleo.tutorial.wizard;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class EclipseConWizard extends Wizard implements INewWizard {

	protected WizardNewProjectCreationPage newEclipseConProjectPage = new WizardNewProjectCreationPage("Web app");

	public EclipseConWizard() {
		super();
		setWindowTitle("WebApp tutorial"); //$NON-NLS-1$
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
		addPage(newEclipseConProjectPage);
	}

	@Override
	public boolean performFinish() {
		try {
			IWizardContainer iWizardContainer = this.getContainer();

			IRunnableWithProgress projectWebappCreation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(newEclipseConProjectPage.getProjectName());
						IPath location = newEclipseConProjectPage.getLocationPath();
						if (!project.exists()) {
							IProjectDescription desc = project.getWorkspace().newProjectDescription(newEclipseConProjectPage.getProjectName());
							if (ResourcesPlugin.getWorkspace().getRoot().getLocation().equals(location)) {
								location = null;
							}
							desc.setLocation(location);
							project.create(desc, monitor);
							project.open(monitor);
							initProject(project, monitor, "data/webapp");
						}
					} catch (CoreException e) {
						System.err.println(e.getMessage()+" -3");
					}
				}
			};
			IRunnableWithProgress projectExtensionCreation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(newEclipseConProjectPage.getProjectName()+".extension");
						IPath location = newEclipseConProjectPage.getLocationPath();
						if (!project.exists()) {
							IProjectDescription desc = project.getWorkspace().newProjectDescription(newEclipseConProjectPage.getProjectName());
							if (ResourcesPlugin.getWorkspace().getRoot().getLocation().equals(location)) {
								location = null;
							}
							desc.setLocation(location);
							project.create(desc, monitor);
							project.open(monitor);
							initProject(project, monitor, "data/extension");
						}
					} catch (CoreException e) {
						System.err.println(e+" -2");
					}
				}
			};
			iWizardContainer.run(false, false, projectWebappCreation);
			iWizardContainer.run(false, false, projectExtensionCreation);
			return true;
		} catch (InvocationTargetException e) {
			System.err.println(e + "-1");
		} catch (InterruptedException e) {
			System.err.println(e +" 0");
		}
		return false;
	}

	public void initProject(IProject project, IProgressMonitor monitor, String resourcesPath) {

		try {
			IFolder modelFolder = project.getFolder("model"); //$NON-NLS-1$
			if (!modelFolder.exists()) {				
				modelFolder.create(true, true, monitor);
			}

			IFolder assetFolder = project.getFolder("assets"); //$NON-NLS-1$
			if (!assetFolder.exists()) {				
				assetFolder.create(true, true, monitor);
			}

			IFolder cssFolder = assetFolder.getFolder("css"); //$NON-NLS-1$
			if (!cssFolder.exists()) {
				cssFolder.create(true, true, monitor);
			}
			
			IFolder imagesFolder = assetFolder.getFolder("images"); //$NON-NLS-1$
			if (!imagesFolder.exists()) {
				imagesFolder.create(true, true, monitor);
			}

			IFolder jsFolder = assetFolder.getFolder("js"); //$NON-NLS-1$
			if (!jsFolder.exists()) {
				jsFolder.create(true, true, monitor);
			}

			IFolder libFolder = jsFolder.getFolder("lib"); //$NON-NLS-1$
			if (!libFolder.exists()) {
				libFolder.create(true, true, monitor);
			}
			
			Enumeration<URL> findEntries = Platform.getBundle("org.eclipse.acceleo.tutorial").findEntries(resourcesPath, "*.js", true);
			
			while(findEntries.hasMoreElements()) {
				
				String relativeFilePath = findEntries.nextElement().getPath();
				String fullFilePath = Platform.getBundle("org.eclipse.acceleo.tutorial").getLocation() + relativeFilePath.substring(1);
				if (fullFilePath.startsWith("reference:file:/")) {
					fullFilePath = fullFilePath.substring("reference:file:/".length());
				}
				File emtl = null;
		        try {
		            emtl = new File(java.net.URI.create(fullFilePath).getPath());
		        } catch (IllegalArgumentException a) {
		            // space in file path ?
		            emtl = new File(fullFilePath);
		        }
				writeFile(emtl, libFolder, monitor);
			}
			
			findEntries = Platform.getBundle("org.eclipse.acceleo.tutorial").findEntries(resourcesPath, "*.css", true);
			
			while(findEntries.hasMoreElements()) {
				
				String relativeFilePath = findEntries.nextElement().getPath();
				String fullFilePath = Platform.getBundle("org.eclipse.acceleo.tutorial").getLocation() + relativeFilePath.substring(1);
				if (fullFilePath.startsWith("reference:file:/")) {
					fullFilePath = fullFilePath.substring("reference:file:/".length());
				}
				File emtl = null;
		        try {
		            emtl = new File(java.net.URI.create(fullFilePath).getPath());
		        } catch (IllegalArgumentException a) {
		            // space in file path ?
		            emtl = new File(fullFilePath);
		        }
				writeFile(emtl, cssFolder, monitor);
			}
		} catch (CoreException e) {
			System.err.println(e +" 1");
		}
	}
	
	public static void writeFile(File file, IFolder folder, IProgressMonitor monitor) {

        String emtlContent = getFileContent(file);
        
        IFile newFile = folder.getFile(file.getName());
        if (!newFile.exists()) {
        	InputStream contents = new ByteArrayInputStream(emtlContent.getBytes());
        	try {
				newFile.create(contents, true, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Reads and return the given file's content as a String. If this file contains encoding information,
	 * we'll use this encoding to read its content.
	 *
	 * @param file
	 *            File we need to read.
	 * @return Content of the file, or the empty String if no such file exists.
	 */
	public static String getFileContent(File file) {
		String content = readFileContent(file, null);
		if (content.length() > 0) {
			String charset = getCharset(content);
			if (charset != null) {
				content = readFileContent(file, charset);
			}
		}
		return content;
	}

	/**
	 * Tries and find an encoding value on the very first line of the file contents.
	 *
	 * @param fileContent
	 *            The content from which to read an encoding value.
	 * @return The charset name if it exists and is supported, <code>null</code> otherwise
	 */
	private static String getCharset(String fileContent) {
		String trimmedContent = fileContent.trim();
		String charsetName = null;
		if (trimmedContent.length() > 0) {
			BufferedReader reader = new BufferedReader(new StringReader(trimmedContent));
			String firstLine = trimmedContent;
			try {
				firstLine = reader.readLine();
			} catch (IOException e) {
				// Cannot be thrown with a String Reader
			}

			Pattern encodingPattern = Pattern.compile("encoding\\s*=\\s*(\"|\')?([-a-zA-Z0-9]+)\1?"); //$NON-NLS-1$
			Matcher matcher = encodingPattern.matcher(firstLine);

			if (matcher.find()) {
				charsetName = matcher.group(2);
			}
		}
		if (charsetName != null && Charset.isSupported(charsetName)) {
			return charsetName;
		}
		return null;
	}

	/**
	 * Reads and return the content of the given file as a String, given the charset name for this file's
	 * content.
	 *
	 * @param file
	 *            File we need to read.
	 * @param charsetName
	 *            Name of the charset we should use to read the file's content.
	 * @return Content of the file, or the empty String if no such file exists.
	 */
	private static String readFileContent(File file, String charsetName) {
		StringBuffer buffer = new StringBuffer();
		FileInputStream input = null;
		InputStreamReader streamReader = null;
		try {
			input = new FileInputStream(file);
			if (charsetName != null) {
				streamReader = new InputStreamReader(input, charsetName);
			} else {
				streamReader = new InputStreamReader(input);
			}

			int size = 0;
			final int buffLength = 8192;
			char[] buff = new char[buffLength];
			while ((size = streamReader.read(buff)) > 0) {
				buffer.append(buff, 0, size);
			}
		} catch (IOException e) {
			// continue and return an empty string
		} finally {
			try {
				if (streamReader != null) {
					streamReader.close();
				}
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				// continue and return an empty string
			}
		}
		return buffer.toString();
	} 
}
