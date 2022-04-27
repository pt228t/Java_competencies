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
       -Goals in maven - 
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
 4. Repositories
 5. Plugin
 6. IDE integration



