## Introduction ##

This page is a step-by-step guide to get started with WDL. It is intended to demonstrate how to start with a new project, and generate source code.

## Requirements ##

This guide is intended to be functional with the following configuration of software versions:
  * [Maven 2.0.7](http://maven.apache.org/) or newer
  * [Eclipse 3.5 (Galileo) + TMF Xtext 0.7.2](http://xtext.itemis.com/) **optional**

> _Even though eclipse is not required to generate code with WDL, it is recomended to be used for model file editing. The WDL editor embedded in Eclipse, performs dynamic syntax checking which may reduce errors in modeling phase._

## Creating Project ##

  * Create an empty directory:
```
 mkdir sample
 cd sample
```
  * Use the maven archetype to create project structure:
```
 mvn archetype:create \
 -DgroupId=com.example \
 -DartifactId=sample \
 -DarchetypeGroupId=org.xmdl.wdl.gen \
 -DarchetypeArtifactId=org.xmdl.wdl.ida-archetype \
 -DarchetypeVersion=0.1.2-SNAPSHOT \
 -DremoteRepositories=http://xmdl.googlecode.com/svn/branches/release-0.7/repository
```

## Code Generation ##
  * Go into the project directory (sample/sample/):
```
 cd sample
```
  * Generate source code and run unit tests:
```
mvn -Pgenerate 
```

## Running Web Application ##
  * Install the "core" module
```
 cd core
 mvn hsql:start install
```
> This will run the unit tests and install the core atrifact into the local maven repository.
  * Run web application
```
 cd ../web
 mvn hsql:start jetty:run
```
> This will run the unit tests for the web module and run the web server with the application installed.
  * Browse to the address http://localhost:8080/ to see the running web application. You'll see a web page similar to this:
> ![http://xmdl.googlecode.com/svn/wiki/WDLGettingStarted/shot01.png](http://xmdl.googlecode.com/svn/wiki/WDLGettingStarted/shot01.png)

This is the end of the Getting Started Guide. For further instructions please go to the [WDLReference](WDLReference.md).