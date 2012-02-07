/********************************************************************************
** Copyright (c) 2012 Obeo.
** All rights reserved. This program and the accompanying materials
** are made available under the terms of the Eclipse Public License v1.0
** which accompanies this distribution, and is available at
** http://www.eclipse.org/legal/epl-v10.html
**
** Contributors:
**    Stephane Begaudeau (Obeo) - initial API and implementation
*********************************************************************************/

var EclipseCon = EclipseCon || {};
EclipseCon.languages = new EclipseCon.LanguagesCollection();
EclipseCon.users = new EclipseCon.UsersCollection();
EclipseCon.projects = new EclipseCon.ProjectsCollection();

EclipseCon.languages.fetch();
EclipseCon.users.fetch();
EclipseCon.projects.fetch();

