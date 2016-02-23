# Introduction #

This page intends to explain details to implement a target platform in XMDL. It is briefly explained how to introduce a new target platform, or change a currently defined platform.

## Platform Development ##

  * A platform is introduced using a the Plugin Extension Point explained below.
  * Templates are added for each type of file generated.
  * Tasks are defined for each template definition in the corresponding platform Task Factory
  * Init (initialization) structures are defined to initialize model elements before code generation.

You can find details about those steps below.

### Plugin Extension Point ###

Each platform is defined as an Eclipse plugin. A platform plugin uses the "xmdl.gen.registry" extension point to register itself as a plugin. Thus, code generation can be performed for this plugin via the editors context menu.

**xmdl.gen.registry** extension point has the following configuration markup:
```
<!ELEMENT extension (platform+)>
<!ATTLIST extension
    point CDATA #IMPLIED
    id    CDATA #IMPLIED
    name  CDATA #IMPLIED>

 <!--
    id - Unique extension id 
    name - Name of extension
 --> 

<!ELEMENT platform EMPTY>
<!ATTLIST platform
    name    CDATA #REQUIRED
    version CDATA #REQUIRED
    class   CDATA #REQUIRED>


 <!--
    name - Name of the platform 
    version - Platform version 
    class - Implementation class name 
 -->
```

An [extension point](http://help.eclipse.org/help32/index.jsp?topic=/org.eclipse.pde.doc.user/guide/tools/editors/manifest_editor/extension_points.htm) must be defined in the platform's plugin.xml file. You can use a simple text editor or the [Plug-in manifest editor](http://help.eclipse.org/help32/topic/org.eclipse.pde.doc.user/guide/tools/editors/manifest_editor/editor.htm) to add a platform definition.

Here is a sample extension point definition:
```
    <extension
         id="org.xmdl.core"
         name="XMDL Core Platform"
         point="org.xmdl.gen.register">
      <platform
            class="org.xmdl.core.platform.XmdlCorePlatform"
            name="Cekirdek"
            version="0.5.0"/>
   </extension>
```

```
TODO: Adding Templates
TODO: Defining Tasks
TODO: Init structure
```





