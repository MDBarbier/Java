Steps to create and build this project using Maven:

1. Create the folder structure
2. Create pom.xml at the top level (i.e. sibling of src)
3. Create .java files (note must be in src/main/java or lower)
4. From the root project directory run mvn -v to test maven is installed
5. mvn compile
6. mvn package
7. java -jar target/gs-maven-0.1.0.jar to run the program
8. Add some tests then run: mvn test to execute them
