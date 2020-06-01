# Tech Test Q2

Solution to Question 2.  Project is a Spring Boot project created with the following options:
- Maven
- Java 11
- Spring Boot 2.3

And with the following dependencies:
- Spring Boot Devtools
- Lombok
- Spring Web


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.glenworsley.techtestQ2.techtestQ2Application` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

There is a Dockerfile in the project which can be used to build and run the project in a Docker container like so:
```shell
docker build -t <tagname> .
docker run -p 8080:8080 <tagname> 
```

Unfortunately there are still a few aspects of the task which were not completed.
The outstanding tasks include:
- Versioning not set up yet.
- SonarCloud integration not set up with Travis build.
- Docker build and publish not set up.
- Incontainer smoke test not done yet.
- Minimization/optimization of docker image not done yet.


## License
[MIT](https://choosealicense.com/licenses/mit/)