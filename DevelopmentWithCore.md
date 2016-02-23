## Introduction ##

This guide is an introduction to development new projects using the xmdl.core platform.

## Setting project libraries ##

You should have finished creating a project, modeling and generation of source code, following the [Modeling Guideline](Modeling.md). Then, you can follow these steps to set up your development environment.

  * Checkout the latest version of core library (xmdl.corelib) from [source repository](http://xmdl.googlecode.com/svn/trunk/xmdl.corelib/) following the [instructions](http://code.google.com/p/xmdl/source).
  * Create a user library called **JAVA\_SERVLET**
    * Open the preferences page using Window -> Preferences menu item
    * Select user libraries configuration page from the tree using path Java -> Build Path -> User Libraries
    * Click New... button on the right
    * Type "JAVA\_SERVLET" as library name, click OK
    * Click "Add JARs" button on the right, when newly created library is selected.
    * Browse to the sub-directory "lib" of xmdl.corelib directory where you have checked out from source library. Select the following jar files and add them by clicking OK.
      * servlet-api.jar
      * jsp-api.jar
  * Repeat the last step for a second user library called **XMDL\_CORELIB**. This time add all jar files recursively under "lib" directory except the ones used in the last step.
  * When finished adding jar files, click OK button of the Preferences dialog
  * Adding user libraries as project library
    * Right-click your project.
    * Select Properties from the context menu
    * Select Java Build Path from the tree on the left
    * Click on Libraries tab on the right
    * Click Add Library... button
    * Select User Library from the list, and click Next.
    * Select your newly created user libraries "JAVA\_SERVLET" and "XMDL\_CORELIB", and click Finish
    * Click OK to close project properties dialog.
  * Make a clean build to your project by selecting Project -> Clean... menu item from Eclipse Menu
  * When clean build is complete, project should not have any error mark icons on.
  * You can view compilation errors by activating the Problems view using the menu item Window -> Show View -> Problems

**TODO following are in draft form**

_Following steps should be performed in order to have success._


## Installing necessary Eclipse plugins ##
  * Preparing Web Development environment. Install following:
    * (Europa Discovery Site) Web and JEE Development
    * Web Tools Platform (WTP) Updates
    * Click "Select Required" to resolve dependencies
    * Accept license

## Convert to Dynamic Web Project ##
  * Open .project file (Ctrl+Shift+R)
  * Add build commands:
```
		<buildCommand>
			<name>org.eclipse.wst.common.project.facet.core.builder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.wst.validation.validationbuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
```
  * Add Natures
```
		<nature>org.eclipse.wst.common.project.facet.core.nature</nature>
		<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>
		<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>
```
  * Save file
  * Open .classpath file (again Ctrl+Shift+R)
  * Add class path entries
```
	<classpathentry kind="con" path="org.eclipse.jst.server.core.container/org.eclipse.jst.server.tomcat.runtimeTarget/Apache Tomcat v5.5"/>
	<classpathentry kind="con" path="org.eclipse.jst.j2ee.internal.web.container"/>
```
  * Refresh project
  * Open Project Properties
  * Project Facets -> Modify Project
  * Select
    * Dynamic Web Module
    * Java, Next
  * Content Directory : web
  * Finish,
  * J2EE Module Dependencies, Select XMDL\_CORELIB from the list
  * Ok

## Adding resource folder ##

Make sure that rsc/ folder under project is marked as a source folder.

  * Open Project Properties
  * Open Java Build Path
  * On Source tab, add rsc/folder as a source folder.


## Add Server (Tomcat) Runtime Configuration ##

  * File->New->Other
  * Server/Server, Next
  * Apache/Tomcat v5.5 Server,
  * Select server (tomcat 5.5) installation location
  * Add your project to the list of configured servers
  * Finish

## Running Project on Server ##
  * Right-click project, Run As -> Run on Server...
  * Select Tomcat, check "Always use this server...", Next, Next
  * check "Update context root...", Finish



If you have a problem during the project setup do not hesitate to inform developers. You can fill an issue form on the project site with all necessary details about your problem, and your contact information.


