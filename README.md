# Simple FIX Executor
## Description
Simple FIX Executor (simplefixexecutor.jar) is a Spring Boot Java application that can be used to receive and acknowledge FIX messages from any FIX client. 

Simple FIX Executor is a simple wrapper around <a href="https://www.quickfixj.org/usermanual/2.1.0/usage/examples.html">quickfixj-examples-executor application</a> that is distributed as a part of QuickFIX/J distribution package. 

FIX protocol functionality is based on <a href="https://www.quickfixj.org/">QuickFIX/J open source library</a>.

## Requirements and Dependencies
Simple FIX Executor requires Java 11 LTS or latest Java 14.

It is a Maven project (see pom.xml, file Apache Maven 3.6.3 is recommended) and depends on:
* Spring 5.3.25.RELEASE https://spring.io/projects/spring-framework
* Spring Boot 2.7.9.RELEASE https://spring.io/projects/spring-boot
* QuickFIX/J 2.2.1 https://github.com/quickfix-j/quickfixj

All dependencies are downloaded from Internet when you run <code>mvn clean install</code>.

## Building
Since project is a Spring Boot project, <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html">Spring Boot Maven</a> build plugin is used to build the artifact.

To build Simple FIX Client run <code>mvn clean install</code> or <code>mvn package</code> or use <code>package.bat</code> in the project folder.

Resulting simplefixexecutor-&lt;version&gt;.jar JAR file will be created in <code>target</code> sub-folder.

This JAR file is a Spring Boot jumbo-JAR that contains all dependencies required to run the application.

## Running
Start the application using:

<code>jar -jar target/simplefixexecutor-&lt;version&gt;.jar</code>

or use <code>mvn spring-boot:run</code> command

or use <code>startServer.bat</code> or <code>startServer.sh</code> script.

## Connections
Simple FIX Executor opens six connections by default:
* port 9876 for [FIX.4.0:EXEC->BANZAI]
* port 9877 for [FIX.4.1:EXEC->BANZAI]
* port 9878 for [FIX.4.2:EXEC->BANZAI]
* port 9879 for [FIX.4.3:EXEC->BANZAI]
* port 9880 for [FIX.4.4:EXEC->BANZAI]
* port 9881 for [FIXT.1.1:EXEC->BANZAI]

All clients logon with senderid = BANZAI and targetid=EXEC, Simple FIX Executor responds with senderid=EXEC and targetid=BANZAI.

You can use <a href="https://github.com/alexkachanov/simpleFIXClient">Simple FIX Client</a> to run with Simple FIX Executor.

## Eclipse
Before opening project in Eclipse, run <code>mvn eclipse:eclipse</code> task in the project's folder. Maven will create Eclipse specific project files. Then import the project into your workspace as a Maven project.

To run project in Eclipse, use Maven task <code>spring-boot:run</code>.
