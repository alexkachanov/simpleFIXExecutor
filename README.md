# Simple FIX Executor
## Description
Simple FIX Executor (simplefixexecutor.jar) is a Spring Boot Java application that can be used to receive and acknowledge FIX messages from any FIX client. 

Simple FIX Executor is a simple wrapper around <a href="https://www.quickfixj.org/usermanual/2.1.0/usage/examples.html">quickfixj-examples-executor application</a> that is distributed as a part of QuickFIX/J distribution package. 

FIX protocol functionality is based on <a href="https://www.quickfixj.org/">QuickFIX/J open source library</a>.

## Requirements and Dependencies
Simple FIX Client requires Java 8 (can also run on Java 11 LTS or latest Java 12). 

It is a Maven project (see pom.xml, file Apache Maven 3.6.1 is recommended) and depends on:
* Spring 5.1.9 https://spring.io/projects/spring-framework
* Spring Boot 2.1.7 https://spring.io/projects/spring-boot
* QuickFIX/J 2.1.1 https://github.com/quickfix-j/quickfixj 

All dependencies are downloaded from Internet when you run <code>mvn clean install</code>.
