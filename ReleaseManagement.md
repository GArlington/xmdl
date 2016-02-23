## Release checklist ##

**_This checklist should be applied, on each release._**

  1. Update local copy to final version from source repository
  1. Run unit tests without any problems
  1. Error free build of binary packages
  1. Deploy binary packages (plugins) on Eclipse, and check for any visible problems
  1. Tag source repository
  1. Upload released package on site, and specify necessary labels
  1. Clear labels for old packages on project "Downloads" page.
  1. Make changes on [Roadmap page](Roadmap.md) if necessary. (e.g. link to download URL)

## Building a distribution ##

For building a distribution, simply run [this ant build](http://xmdl.googlecode.com/svn/trunk/xmdl.lib/build.xml) script. This script needs a build configuration file located in **${user.home}/xmdl.build.properties**. You can locate a sample of the file [here](http://xmdl.googlecode.com/svn/trunk/xmdl.lib/).

Distribution files will be created in **xmdl.lib/dist/** folder.

## Tagging Source Repository ##

When a distribution (not valid for alpha and beta distributions) is delivered, the source repository is tagged using the SVN tag command.

Following command can be used for this purpose.

```
>svn copy https://xmdl.googlecode.com/svn/trunk/ \
          https://xmdl.googlecode.com/svn/tags/<tag_name> \
          -m "Tagging the <version_number> release" \
          --username <your_SVN_username>
```
where 

&lt;tagname&gt;

 can be something like release-x.y.z considering the version number.

Sample:

```
>svn copy https://xmdl.googlecode.com/svn/trunk/ \
          https://xmdl.googlecode.com/svn/tags/release-0.5 \
          -m "Tagging the 0.5.0 release" \
          --username hakandilek
```



