# Simple Demonstration of java.util.ServiceLoader usage

The project contains the following modules:

* common: contains the interface `TaskExecuter` to be implemented
* module1: contains the first implementation 
* module2: contains the second implementation
* main: uses the the ServiceLoader to load all the implementations

# How to run:

from an IDE, you can directly run the main class in the main module. 

from a terminal, you can run: `mvn install && mvn -f main exec:java`