## Introduction ##

This guide intends to contain brief information for XMDL developers.

## Development Environment Setup ##

You would need to install the following software components for XMDL development:

##### Install Eclipse Classic 3.3.x #####

  * Download and unzip [Eclipse Classic](http://www.eclipse.org/downloads/moreinfo/classic.php) 3.3.x (includes PDE),

##### Download and install necessary plugins #####

  * Download [update site bookmark file](http://xmdl.googlecode.com/svn/trunk/xmdl.update/Bookmarks-dev.xml), and save to a local folder
  * Run eclipse using a clean workspace
  * Go to menu Help -> Software Updates -> Find and Install
  * Select "Search for new Features to install", click next
  * Click "Import Sites...", select bookmark file you've downloaded.
  * Select the following from the list, click Finish;
    * Europa Discovery Site
    * Subclipse update for 1.2.x
    * XMDL Update Sites
  * Select mirrors if promted
  * Select the following features to be installed, then click Next
    * Europa Discovery Site/Models and Model Development
      * Eclipse Modeling Framework (EMF) Runtime + End-User Tools 2.3.1.x
      * Eclipse Modeling Framework (EMF) Extender SDK 2.3.1.x
      * Java Emitter Templates (JET) (Incubation) 0.8.1.x
      * Java Emitter Templates (JET) SDK (Incubation) 0.8.1.x
    * Subclipse update for 1.2.x/Subclipse Plugin
      * Subclipse 1.2.x
    * XMDL Update Sites/XMDL Development Updates
      * XMDL Universal Code Generator 0.6.x
  * Accept license agreement, click Next and Finish
  * Install all components and restart eclipse when installation is finished.

##### Checkout xmdl components from SVN repository #####

When installation is complete, add XMDL project components into your workspace.
_It is recommended to setup a separate workspace in Eclipse containing the following XMDL components_

  * Click menu item File -> New -> Project,
  * Select SVN -> Checkout Projects from SVN, click Next,
  * Select "Create a new repository location", click Next,
  * Enter "https://xmdl.googlecode.com/svn/trunk/" for URL, click Next,
  * Select the following folders on tree;
    * xmdl/
    * xmdl.core/
    * xmdl.corelib/
    * xmdl.gen/
    * xmdl.genext/
    * xmdl.genext.test/
    * xmdl.lib/
    * xmdl.ida/
    * xmdl.ui/
    * xmdl.update/
    * xmdlbo.ui/
    * xmdldb.ui/
    * xmdlgen.ui/

> ![http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0500.png](http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0500.png)

  * Click Finish

  * Perform this step for the wiki/ folder under https://xmdl.googlecode.com/svn/wiki/ if you would like to follow wiki changes inside Eclipse IDE.

## Run/Debug XMDL using Eclipse ##

In order to run XMDL inside Eclipse you should first set up a Run or Debug configuration. Follow those steps to setup a Run configuration for XMDL:

  * Run -> Open Run Dialog...
  * Click "Eclipse Application", Click "New" button.
  * In the dialog set the following:
    * Name : XMDL
    * Run a Product : org.eclipse.platform.ide
  * Click Run.
  * A new Eclipse instance will run with the final version of XMDL in your workspace.
> ![http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0600.png](http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0600.png)

If you want to debug this instance of eclipse inside the previous eclipse instance,
  * put breakpoints etc.,
  * do one of the following;
    * either select Run -> Debug History -> XMDL from the menu
> ![http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0610.png](http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0610.png)
    * or click the pull-down debug icon and select XMDL from the menu.
> ![http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0620.png](http://xmdl.googlecode.com/svn/wiki/DevelopersGuide/0620.png)

## Additional Resources ##

  * You can find [here](XMDLComponents.md) details and inter-dependencies of the XMDL Components

  * [Platform Development Guide](PlatformDevelopmentGuide.md) contains some important information guiding how to introduce a new target platform or maintain an existing one.