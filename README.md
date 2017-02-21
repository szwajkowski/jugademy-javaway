# Building java app using java tools

This repository contains basic examples of how to build an Java application only with use of tools provided with JDK, such as `javac` and `jar`.
All directories include README's where detailed commands are presented. They let you build and execute the app.

## Where to start?

### simple-java-app
First directory you would like to check is `simple-java-app`. It contains two classes application, simple HelloWorld. One class depends on another, that forces need to compile them together or to compile dependency first and provided it via classpath.

### external-dependecies
This folder has an app with dependency on [commons-lang3](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.5) jar. It shows how to add a jar to classpath so the app can be built and executed.

**Disclaimer**
This dependency usage is artificial, just for the purpose of this tutorial.

### junit
Here I have added a [JUnit](http://junit.org/junit4/) test, one can notice new jars in libs folder. As in previous examples commands to build code and execute tests are presented.

## Where to go next?
Now you can explore Maven and Gradle which let you perform above operations in a single command.
* https://github.com/szwajkowski/jugademy-maven
* https://github.com/szwajkowski/jugademy-gradle
