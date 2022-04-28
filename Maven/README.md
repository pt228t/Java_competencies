Maven is managed by Apache software foundation
Website - maven.apache.org
Open source

WHY USE IT? 
Repeatable builds
Transitive dependency
Environment - contains everything we need for our environment. whether buildinig from IDE or CLI, it contains all info to build our code and reproduce our code 
Local repo - it maintains it's cache in local file which can be accessed by multiple projects in that machine 
Works well with IDE or standalone(cli)
follows convention over configuration - Meaning if you set it up using defined convention then it works very well.


Scopes - 
 compile 
 provided
 runtime
 test
 System
 import

Working on Java10+ version
Maven installation
Transitive dependencies
Building java11 or newer
Using maven with existing code
Maven is built on convention over configuration


TOPICS - 
 1. Introduction to maven - 
       -Build tool 
          -produces artifact (Could be zip file or component or jar)
          -Manages dependencies (To run your applciation, you need transitive dependencies. Maven takes care of it)
       -Project management tool - also manages the versioning of code
          -Handles versions and releases of components
          -Describes about the projects
          -Produce javadocs/site information

 2. Structure -
       it means folder and file structure as well as location of files and how code gets compiled and pacakged.
       -Folder Structure
          -By default, maven looks into src/main/java for source code
              - /src/main/java  - contains java code and package declaration at top of application
              for Testing - 
              - /src/test/java (This is specifically for unit test and not for integeration tests and other testing(black box and white box)).
          -target folder - it compiles all the code to this directory
          -pom.xml  - All the references are referred from here
       -POM file basic
       -Basic commands and goals
       -Dependencies
       -Local repo
       
       -Goals -- 
           
           1. clean - it cleans the target directory and any of it's generated sources

           2. compile - it will compile the code and create class files in classes directory under target

           3. package - it runs the compile then test and eventually packages the files based on 
            packaging type in pom.xml and put it under target directory

           4. install - it will run the package command and then install it in local repo. The default local repo is .m2

           5. deploy - it runs the install commad and then deploys it to corporate repo or remote repo

        - Defaults - 
              We do override the defaults of maven under  <build> element in pom

        - Local repo structure - 
            - ~/.m2/repository
            - Store artifact using - 
                <groupId>/<artifactId>/<version>
            - Avoids duplications
         

 3. Dependencies
         Outline - 
    1. Versions 
          - SNAPSHOTS - All the development should begin with the snapshots . It is case sensitive and has to be in upper case always
               - myapp-1.0-SNAPSHOTS
          - Release - 
              Idustry common terms - 
                 myapp-1.0-MC1.jar (milestone release)
                 myapp-1.0-RC1.jar (Release candidate)
                 myapp-1.0-RELEASE.jar 
                 myapp-1.0-FINAL.jar

    2. Types 
          - Packaging types (It refers to packaging of our applications)
              - pom,war,ear,jar,maven-plugin
              - Default is jar
              - Dependency pom ( This is interesting feature wherein if we want multiple dependencies to be downloaded without mentioning them separately then we can call this pom and this pom contains the different libraries references in it)

    3. Transitive dependencies 
          - If you pull down some dependency say hibernate, then whatever dependency that hibernates needs is downloaded automatically.(if there is a conflict, then it will try to resolve the conflict by bringing in the newer version but it does not always works)
            
    4. Scopes
          -compile (It is the default scope,we don't have to explicilty list it in pom)
          
          -provided (It is lot like compile. It means artifact is going to be available throughout entire build cycle but it is not going to package it up in the end. Examples are servlet api or xml api , they are available throughout phases but not included in final artifact as it will be provided by the container wherein we will deploy our app to)

          -runtime (It is not needed for compilaton but is needed for execution. Dynamic loaded libraries are like JDBC's jars to connect to database. it is quite the opposite of provided. We don't need it for compling,testing and packaging but just need it for the application to run)
 
          -test(Example - JUNIT or Testng jars . We don't need it for compiling , packaging or running even)

          -system (We should not use it explicitly as it could hamper the maven system. it is just used as default in maven just to tie the existing project to maven build)

          -import (It is used for dependency management and is an advanced maven topic)

 4. Repositories
       Outline 
        - Dependency Repo
        - Plugin Repo
        - Releases/SNAPSHOTS

        Local repo 
        - Maven firstly looks into local repo i.e m2 and if it does not find the artifacts then it downloads it from remote repo.
        - Storage path would become - (~/.m2/repository/<groupId>/<artifactId>)
        - We also have SUPER-POM which gets installed in the path where maven installation occured but we don't need to override it as there are other ways to achieve it.


 5. Plugin
       - Goals
           -Default goals (clean,compile,test,package,install,deploy) . These default goals are mentioned in SUPER-POM and are run by the default plugins installed in pom
           
           -These goals in SUPER-POM are then inherently added to effective pom.

           -Goals are always tied to a phase
       - phases
           - Validate - validate project and structure(also checks things like permission to create the directory) 

           - Compile -  it compiles out the source code and it does not compile the test code. That happens in test phase

           - Test - it tests the compiled code which is compiled in test phase. directory - /src/test/java

           - Package - it packages the code in specific package type(which is mentioned in the pom).

           - Integration-test - it deploys and run integration tests(Not extensively used since it is a newer phase in maven lifecycle)

           - Verify - it runs checks to  verify the integrity before installing it in local repo and deploying it to a remote repo.

           - Install - it installs the package to local repo(~/.m2)

           - Deploy - it copies the package to remote repo

       - compiler plugin
            - It defaults to older Java version  i.e Java 1.7 irrespective of JDK that you installed, that is why it overwritten in most of the poms to use appropriate Java release

            - It is customized using configuration element<configuration></configuration> 
                  - We can set fork under customization (which creates separate threads)
                  - Memory (Incase if we face heap issues while running the plugin)
                  - source (from where to compile)
                  - target (to where put the compiled code)
               
       - Jar plugin
           - Package
           - Package phase
           - Configurations 
                -includes/excludes
                - Manifests
       - Sources plugin
       - Javadoc plugin

 6. IDE integration



 