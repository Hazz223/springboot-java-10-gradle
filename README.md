# Java 10 modular Springboot 2 Gradle sample application

This is an example Springboot 2 application that uses Java 10, Gradle 4.7, Gradle modules, and Java 10 modules. 

You can clone/download, and should be able to run the command:
`./gradlew bootRun`

## Initial setup

To create your own Springboot 2 app, with Java 10 modules, there are a few things you've got to add:

### Module path

You ned to add to the compiler you'd like to use modules. The below should be added to your root gradle file 
in the `subproject` section.
```groovy
    // required for modules
    afterEvaluate {
        compileJava {
            inputs.property("moduleName", moduleName)
            doFirst {
                options.compilerArgs = [
                        '--module-path', classpath.asPath
                ]
                classpath = files()
            }
        }
    }
```

### Importing libraries

Using the term `implementation` seems to be the new thing in gradle. However, you'll probably come across a lot of issues where
imported libraries share package names. In this case, you've got to exclude one library to favour another. 
You can do this by doing the following (though adapt for your library needs):
```groovy
    implementation("org.springframework.boot:spring-boot-starter-web:${springboot}") {
        exclude(module: 'javax.annotation-api')
        exclude(module: 'java-annotation')
        exclude(module: 'spring-boot-start-logging')
    }
```

## Adding a new module

Adding a new module should be pretty simple. Create a new Gradle module, and in it's `build.gradle` file, add the following
line:
`ext.moduleName = 'com.your.package.structure'` - this should match the name in the `module-info.java` file.
Gradle will complain until you've added this line, so do it early on. Then go ahead and add your `module-info.java` file.

## Added tips and tricks

### Spring requires / other libraries
Intellij won't understand a library until it's been added to the `module-info.java` file. While technically correct,
it's a total pain to work with if you don't know what class comes under what package. 
I've found that if you work without modules, and then add them in, Intellij is smart enough to ask you to add them to your
`module-info.java`. However, trying to convert an existing project to modules can be a bit of a pain. So here's some 
requires that are needed for basic Springboot usage:

```java
    requires spring.beans;
    requires spring.boot;
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires jackson.annotations;
    requires java.validation;
```


## Contributing
If you'd like to add to this project, raise pull request and I'll get back to you.
You can also contact me on [twitter](https://twitter.com/hazz223)
