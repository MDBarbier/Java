To package and run this app:

    mvn package && java -jar target/gs-spring-boot-0.1.0.jar

To go to the home page:

    1. open browser
    2. go to http://localhost:8080

To view app health:

    1. Open browser
    2. Go to http://localhost:8080/actuator/health

To run tests:

    mvn clean test -Dest=HelloControllerIT
    mvn clean test -Dest=HelloControllerTest