# JUnit demo project

Simple demo of using JUnit in a java project.

## To compile and run in VSCode:

0. Packages to have installed:
- Debugger for Java
- Java Dependency viewer
- Java Extension pack
- Java Run
- Java Test Runner
- Language Support for Java by Redhat
1. compile your class you are testing with:
  javac Calculator.java
2. next compiled your test class:
  javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar CalculatorTest.java
3. run the test:
  java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
4. view the output, there is a period for each successful test