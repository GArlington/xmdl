## Introduction ##

This is a step-by-step guide to XMDL installation. Please follow the steps below to perform a successful XMDL installation.

This guide is intended to be functional with the following configuration of software versions:
  * [Eclipse](http://www.eclipse.org/) 3.4 (java-ganymede)
  * [EMF](http://www.eclipse.org/modeling/emf/) 2.4.0
  * [EMFT JET](http://www.eclipse.org/emft/projects/jet/) 0.9.0
  * [XMDL](http://xmdl.googlecode.com/) 0.6.0

## Eclipse Installation ##

Latest version of XMDL runs on Eclipse Platform 3.4. If you have Eclipse 3.4 already installed on your system, you can simply skip this step.

  * Go to [Eclipse download page](http://www.eclipse.org/downloads/)
  * Select "Eclipse IDE for Java Developers" that suits your operating system configuration
  * Save the zip file to your local drive.
  * When download is complete extract the zip file. (e.g. d:/eclipse)
  * Run eclipse executable from /eclipse directory. e.g. eclipse.exe for MS Windows platform.
  * Before opening Eclipse should ask you about a workspace location. This will be the place to store all data about your projects. Select a newly created folder, and mark the checkbox below denoting "Use this as default and do not ask again". This will save you confirming the same place for every eclipse startup. Later you can change it by menu item File -> Switch Workspace -> Other... if you wish.

Eclipse should be ready for further installation after this step.

## [EMF](http://www.eclipse.org/modeling/emf/) (Eclipse Modeling Framework) Runtime Installation ##

Latest version of XMDL runs on EMF 2.4.0. The next step will install EMF as a dependency of XMDL.

## XMDL Installation ##

It is possible to install/update XMDL using Eclipse update mechanism. Follow these steps to perform installation of XMDL with Eclipse Update.

  * Initiate Eclipse Install/Update wizard using the menu item Help -> Software Updates
  * Click "Available Software" tab.
  * Click "Add Site..." button.
  * Enter the following information in the dialog and click Ok.
```
 Location: http://xmdl.googlecode.com/svn/trunk/xmdl.update/site.xml
```
  * Select newly added update site from the list and select the latest version from "XMDL Stable Updates" or "XMDL Development Updates".
  * Click "Install..." button.
  * Select the XMDL Universal Code Generator

<some\_version>

 version from the list and click Next.
  * You can now accept the license agreement, click Next and Finish consecutively.
  * Install all components and restart eclipse when installation is finished.

## Verify installation ##

  * Start Eclipse (again). You should have shut it down after EMF Runtime installation
  * When Eclipse is stated, click menu item Help -> About XMDL... If you can not see this menu item, something might be wrong with your installation.
  * If you see a copyright dialog about XMDL, this means that you have successfully completed your installation.

If you have a problem during the installation do not hesitate to inform developers. You can fill an [issue form](http://code.google.com/p/xmdl/issues/entry) on the project site with all necessary details about your problem, and your contact information.
