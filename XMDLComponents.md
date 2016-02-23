# Introduction #

In this page you can find brief explanation of XMDL components and their dependencies.

## XMDL Components ([Meta-models](Metamodel.md) and Editors) ##

  * **xmdl (org.xmdl.model)** is the component where main metamodel and sub-metamodel components are defined. checkout model directory under xmdl component for metamodel (.ecore) definitions. Most of the code used in this component is auto-generated using the EMF code generation support.
  * **xmdl.gen (org.xmdl.gen)** is the code generation engine. Further platforms can be added as [extension points](http://wiki.eclipse.org/index.php/FAQ_What_are_extensions_and_extension_points%3F) for this component using an [Eclipse Plugin definition](http://wiki.eclipse.org/FAQ_What_is_a_plug-in%3F). This component also contains [helper classes](http://java.sun.com/blueprints/corej2eepatterns/Patterns/ViewHelper.html) to support templates during code generation.
  * **xmdl.genext (org.xmdl.genext)** is the code generator extension module. JET2 tag libraries are defined in this module.
  * **xmdl.genext.test (org.xmdl.genext.text)** is the unit test module for the **xmdl.genext** module.
  * **xmdl.update** is the component that provides the eclipse update site and the **org.xmdl** feature definition.
  * **xmdl.ui (org.xmdl.xmdl.ui)** is the component that provides UI editor support for the XMDL Base Metamodel (.xmdl).
  * **xmdlbo.ui (org.xmdl.xmdlbo.ui)** is the component that provides UI editor support for the XMDL Business (Service) Layer Metamodel (.xmdlbo).
  * **xmdldb.ui (org.xmdl.xmdldb.ui)** is the component that provides UI editor support for the XMDL Database Metamodel (.xmdldb).
  * **xmdlgen.ui (org.xmdl.xmdlgen.ui)** is the component that provides UI editor support for the XMDL Code Generation Metamodel (.xmdlgen).
    * All those .ui components follow MVC pattern and provide the Controller/View layer in order to introduce editor support for each model.
    * Most of the code used in those components are auto-generated using the EMF code generation support.
    * _Please refer to the [Meta-model information page](Metamodel.md) for details about these meta-models._
    * Checkout the following for further information about EMF editors and code generation.
      * [EMF tutorial](http://www.eclipse.org/articles/Article-Using%20EMF/using-emf.html)
      * [EMF Overview page](http://dev.eclipse.org/viewcvs/indextools.cgi/org.eclipse.emf/doc/org.eclipse.emf.doc/references/overview/EMF.html)
      * [EMF Demo Video](http://redmonk.com/tv/eclipse-emf-demo-large/)
  * **xmdl.lib** is the place where depended libraries are stored. Those libraries (like log4j) are used by other xmdl components. Build scripts used to build all xmdl components are also stored here. Delivery of the whole package is performed using these scripts.
  * **xmdl.core (org.xmdl.core)** is the default platform implementation, with the code name "Cekirdek". Please refer to [Platform Guide](CorePlatform.md) to have more information about implementation details.
  * **xmdl.corelib** libraries referenced by **xmdl.core** component. It also provides the base framework library (xmdl.corelib.jar).
  * **xmdl.ida (org.xmdl.ida)** is the final platform implementation, with the code name "IDA". IDA platform is introduced with XMDL 0.6.0 Please refer to [Platform Guide](IDAPlatform.md) to have more information about implementation details.

### Inter-Component Dependencies ###

> XMDL Components have the following dependency structure on the plugin level. Third party depencencies are marked with _italic_ letters.

  * xmdl (org.xmdl.model) ->
    * _org.eclipse.core.runtime_
    * _org.eclipse.emf.ecore.xmi_
    * _org.apache.log4j_
    * _org.apache.commons.beanutils_
  * xmdl.core (org.xmdl.core) ->
    * org.xmdl.model
    * org.xmdl.gen
    * _org.eclipse.emf.ecore_
    * _org.eclipse.emf.codegen_
    * _org.eclipse.core.runtime_
    * _org.apache.log4j_
    * _org.eclipse.jet_
  * xmdl.ida (org.xmdl.ida) ->
    * org.xmdl.model
    * org.xmdl.gen
    * org.xmdl.genext
    * _org.eclipse.emf.ecore_
    * _org.eclipse.emf.codegen_
    * _org.eclipse.core.runtime_
    * _org.apache.log4j_
    * _org.eclipse.jet_
  * xmdl.gen (org.xmdl.gen) ->
    * org.xmdl.model
    * _org.eclipse.emf.ecore.xmi_
    * _org.eclipse.emf.codegen_
    * _org.eclipse.core.runtime.compatibility_
    * _org.eclipse.core.resources_
    * _org.eclipse.jdt.core_
    * _org.junit_
    * _org.apache.log4j_
    * _org.eclipse.jet_
  * xmdl.genext (org.xmdl.genext) ->
    * org.xmdl.model
    * _org.eclipse.jet_
    * _org.eclipse.core.runtime.compatibility_
    * _org.eclipse.emf.ecore_
  * xmdl.genext.test (org.xmdl.genext.test) ->
    * org.xmdl.model
    * org.xmdl.gen
    * org.xmdl.genext
    * _org.eclipse.emf.ecore_
    * _org.eclipse.core.runtime.compatibility_
    * _org.junit_
    * _org.apache.log4j_
    * _org.eclipse.jet_
  * xmdl.ui (org.xmdl.xmdl.ui) ->
    * org.xmdl.model
    * org.xmdl.gen
    * _org.eclipse.core.runtime_
    * _org.eclipse.core.resources_
    * _org.eclipse.emf.mapping_
    * _org.eclipse.emf.ecore.xmi_
    * _org.eclipse.emf.codegen.ecore.ui_
    * _org.eclipse.jdt.core_
    * _org.eclipse.jdt.ui_
    * _org.apache.log4j_
  * xmdlbo.ui (org.xmdl.xmdlbo.ui) ->
    * org.xmdl.model
    * org.xmdl.xmdl.ui
    * _org.eclipse.core.runtime_
    * _org.eclipse.emf.edit.ui_
    * _org.eclipse.core.resources_
    * _org.eclipse.ui.ide_
    * _org.eclipse.emf.ecore.xmi_
  * xmdldb.ui (org.xmdl.xmdldb.ui) ->
    * org.xmdl.model
    * org.xmdl.xmdl.ui
    * _org.eclipse.core.runtime_
    * _org.eclipse.emf.edit.ui_
    * _org.eclipse.core.resources_
    * _org.eclipse.ui.ide_
    * _org.eclipse.emf.ecore.xmi_
  * xmdlgen.ui (org.xmdl.xmdlgen.ui) ->
    * org.xmdl.model
    * org.xmdl.xmdl.ui
    * _org.eclipse.core.runtime_
    * _org.eclipse.emf.edit.ui_
    * _org.eclipse.core.resources_
    * _org.eclipse.ui.ide_
    * _org.eclipse.emf.ecore.xmi_