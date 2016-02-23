## Introduction ##

This page is a step-by-step guide to modeling with XMDL. This guide does not intend to guide you through deep coding practice on the generated code. You can refer the specific platforms guide if you are interested in the platform details. Please follow the steps below to model and generate code for a sample application.

This guide is intended to be functional with the following configuration of software versions:
  * [Eclipse](http://www.eclipse.org/) 3.3.1.1 (java-europa-fall2)
  * [EMF](http://www.eclipse.org/modeling/emf/) 2.3.1
  * [EMFT JET](http://www.eclipse.org/emft/projects/jet/) 0.8.1
  * [XMDL](http://xmdl.googlecode.com/) 0.6.0

## Sample Model ##

This guide aims to introduce XMDL Modeling basics using a sample model. This sample model consists of a trivial library model that contains
  * Book class - Identifying books classified by their authors and types
  * Author class - Identifying author of a book. Author class has a many-to-many relation with Book class.
  * BookType enumeration - Identifying the type of a book

## Modeling Perspective ##

After a successful installation following the [installation guide](Installation.md), now when you click the menu item "Window" -->  "Open Perspective" --> "Other", you should see the following following dialog.

> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0010.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0010.png)

Choose "XMDL Modeling" and click "OK".

Now, XMDL Modeling Perspective should be activated. By default, layout of the perspective should have the following components:

  1. Navigator Pane
  1. Editor Space
  1. Outline Pane
  1. Properties Editor

> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0100.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0100.png)

## Creating Project ##

  * Using File -> New -> Project... menu item you can start the new project wizard.
  * Select XMDL -> XMDL Java Project from the tree and click next.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0110.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0110.png)
  * Type name of the project and (if necessary) specify project location and JRE to use. It is recommended to use the "Create separate folders for sources and class files" for project layout. Click next.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0120.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0120.png)
  * On the next page, do not alter the source code location, since "src" is the default target location for the generated codes. Click Finish to finish the project creation wizard.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0130.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0130.png)
  * When wizard is finished, you should have the following project layout automatically created.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0140.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0140.png)

## Editing Model ##

When a project is created, the initial model file is automatically created and placed under the "model" folder in project.

> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0150.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0150.png)

Follow the steps below to edit the model.

### Defining a package ###

Just like Java packages, Packages in XMDL are used to denote seperate modules of your software model.

  * Create a new package using the context menu of the project. Select New Child -> Package as shown below:
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0160.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0160.png)
  * Edit the package using the Properties editor on the right bottom corner. Type "xmdl.library" as package name
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0170.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0170.png)

### Defining a class ###

Classes are the main building blocks of an XMDL model. You can create a new Class as a child of a package.
  * Create a new class using the context menu of the package. Select New Child -> Class as shown below:
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0180.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0180.png)
  * Edit name of the class, and specify "Book" as name
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0190.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0190.png)

### Defining attributes ###

Attributes are defined as child elements for classes.

  * You can define a new attribute using the context menu item New Child -> Attribute of a class.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0200.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0200.png)
  * Using the properties editor, name the attribute as "name", specify type as "String" and  and length as 50 using the properties editor
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0210.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0210.png)
  * Define further attributes for the Book class as introduced with the picture below
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0220.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0220.png)

### Defining an enumeration ###

With XMDL you can define simple enumerations and use these as your attribute types.

  * Create a new Enumeration using the context menu item of package New Child -> Enumeration
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0230.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0230.png)
  * Name the enumeration as BookType using the properties editor.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0240.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0240.png)
  * Enumeration Literals are choices/values an enumeration can take. Create an enumeration literal using the context menu item of the "BookType" enumeration New Child -> Enumeration Literal
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0250.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0250.png)
  * Name the literal "NOVEL", and give the value 1 using the properties editor.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0260.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0260.png)
  * Introduce further literals as shown below
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0270.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0270.png)
  * Specify default Literal for BookType Enumeration as shown below. This means that, an attribute specifying this enumeration as its own type, will have the default value set here.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0280.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0280.png)
  * Define an attribute for Book class and name it type. This attribute will have BookType enumeration as it's type. Finally, project should look like the following below.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0290.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0290.png)



### Defining associations ###

Associations define inter-class relations. An attribute of a class may be associated with another class in the model.

  * In order to associate classes with each other, you can define an Author class a name attribute. This Author class will be associated with the existing Book class. Finally, your attributes will be like the following.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0300.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0300.png)
  * Create an attribute named "authors" for book class, specify it's type as Author, and Association Type as Many To Many, and set it as navigable. This attribute will be used for association between Book and Author classes on the Book side.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0310.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0310.png)
  * Define another attribute named "books" under Author class, specify it's type as Book, Association Type as Many To Many, and set the Opposite side as "authors" attribute under Book class. When an opposite of an attribute is set, the opposite attributes opposite field is automatically set on the other side.
> > ![http://xmdl.googlecode.com/svn/wiki/Modeling/0320.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0320.png)

## Code Generation ##

> On the final part of the tutorial we will see how code generation is performed with XMDL.

### Initialization ###

_This part of the tutorial is optional. You can simply skip this step if you are not interested in changing [sub-models](XMDLSubModel.md), or don't have any detailed information about [sub-models](XMDLSubModel.md)._

Initialization is the first step that builds up sub models and initializes them according to the prepared XMDL model. The initialization process is performed considering a set of assumptions. Before a target platforms source code will be generated, it's model should be initialized. Indeed, code generation process includes the initialization phase inside, but user is not informed about it.

XMDL Initialization is run with the context menu item that is visible with the right click on a project, package or a class element.
> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0330.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0330.png)

After initialization, [sub-models](XMDLSubModel.md) are created and stored under model directory. This appears to be the same folder where XMDL model (.xmdl) file resides.
> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0340.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0340.png)

Those [sub-model](XMDLSubModel.md) files are
  * .xmdlbo - XMDL Business sub-model
  * .xmdldb - XMDL Database sub-model
  * .xmdlgen - XMDL code generation sub-model

When initialized for the first time, a database sub-model is created using tables and fields. Each class will have its own corresponding database table. Check out relation table TBL\_BOOK\_AUTHOR. This class is used to satisfy explicitly created many-to-many relational mapping.
> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0350.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0350.png)

### Code Generation ###

Code generation can be performed for several target platforms that are defined as Eclipse plugins. Code development platform shipped with XMDL is the "Cekirdek" (xmdl.core) Platform. You can generate code for that platform using the context menu that is available with the right click.
> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0360.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0360.png)

> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0370.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0370.png)

When code generation is complete, you can browse generated files. Cekirdek platform has the following directory structure:
  1. Java source files
  1. Java Resource files
  1. Unit Test source and resources
  1. Web Resources

> ![http://xmdl.googlecode.com/svn/wiki/Modeling/0380.png](http://xmdl.googlecode.com/svn/wiki/Modeling/0380.png)


**TODO**
  * Making changes, and re-generating code. Introduce merge strategy.
    * @generated tag
    * @keep tag

