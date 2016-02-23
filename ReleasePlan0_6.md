## Introduction ##

This document lists the features and ideas that will be included with version 0.6 of the software.

Main theme of this release is integration of the platform "IDA" and XMDL code generator. IDA platform focuses on the following principles:

  * User friendliness. - One-click code generation & deployment
  * Clean framework. - Minimizing development effort.
  * Stay shiny. - Keeping up-to-date with new tools/technologies.
  * _Any other?_

## Details ##

In this part, ideas will be detailed referring to the related [issues](http://code.google.com/p/xmdl/issues/list) when necessary. All open issues in this release can be followed [here](http://code.google.com/p/xmdl/issues/list?can=2&q=Milestone-Release0.6&cells=tiles).

A draft project called [taslak](http://code.google.com/p/taslak/) is created to shape the new platform implementation.

### Appfuse 2.x ###

[Appfuse 2.x](http://appfuse.org/display/APF/Home) project structure will be used as the backbone. Following libraries/frameworks will be integrated accordingly. Those will be detailed below if necessary.
  * [Maven 2](http://maven.apache.org/)
  * [Struts 2](http://struts.apache.org/)
  * [Acegi Security Framework](http://www.acegisecurity.org/)

### Maven ###

Directory layout of the generated project will be compatible with Maven project layout.

### Acegi Security ###

Acegi will be integrated with the following concerns.

  * USER, ROLE, and USER\_ROLE (names may change) tables will be automatically added to the DB model.
    * This feature will be optional. Using an internal database structure for the security will be selected on the model (.xmdl) level with a flag on the project. When an external security scheme is selected, those tables will not remain in the target application.
    * Those tables will be set to be "read-only" on the DB model (.xmdldb). and will not be changed. This feature will be supported by [this issue](http://code.google.com/p/xmdl/issues/detail?id=33).
    * Special prefixes may be assigned for those table names.


