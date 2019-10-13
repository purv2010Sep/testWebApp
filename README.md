# Assessment 

This is a Assessment web application. User can develop/debug/run the automation scripts to test UI web application.
This test project is built on selenium and TestNG  automation test framework, script language is used in writting automation test is Java. 
 
Getting started:

Git Repository: 
[Web App Test](git@github.com:pankajsir/testWebApp.git)

**Architecture**

common - Core library

- webHelper - business specific library

- page_object.Screens - class for individual screens

- object.repository - element identifiers for the page_object.Screen

- resources - artifact of .csv, .properties and testing driver files

 **Test**
 
webAppTest  - actual test

## Prerequisites

The following tools and pre-requisites must be available on the machine being used to develop and/or run selenium tests:

Eclipse - IDE

- [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)

- Build Automation tool [Gradle](https://gradle.org/releases/): Install gradle 5.5 or later

- Selenium Test Driver  [Selenium Driver](https://www.seleniumhq.org/download/) : This needs to import in java build path in eclipse 
	Right click on project folder -> select Build path -> Configuration build Path add the jar file in library section

- Chrome Driver [Testing Browser](https://www.seleniumhq.org/download/)

## Environment variables:

1. JAVA_HOME - set the value path of jdk version folder where java is install on machine
2. GRADLE_HOME - set the value path of your Gradle folder location on machine

## Test, build and run the project

Once environment variables are set open the project in eclips and add testNG plugins to eclipse:

Click on Help->Install New software and add

1. TestNG Eclipse - http://beust.com/eclipse


## Gradle command to compile and run the project

Open command prompt and go to project folder and run the commands: 

### Command to clean the eclipse dependencies and download fresh dependencies and build the project.
  
```bash
Gradle cleaneclipse eclipse
Gradle build
Gradle Dependencies

```

### Compile the java Main and Java test classes. whenever there is a change in any main and java classes need to run the following commands

```bash
Gradle CompileJava
Gradle CompileTestJava

Also you can run above 2 commands in one command:  Gradle CompileJava CompileTestJava
```


### Run the test - This is for CICD Integration

Following command runs the specified task mentioned in build.gradle file and run the tests methods/class/packages provided in testNg XML file in source folder.

```bash
Gradle webTest
```
## How to prepare testNG.XML file to run methods, multiple methods and class

### Run the spacific method: <methodName> pass the method name to be run

	<classes>
		<class name="iress.com.au.web.WebModellingTestClass">
			<methods>
				<include name="methodName" />
			</methods>
		</class>
	</classes>

### Run the multiple method: <methodName1>,<methodName2> pass the method names to be run

	<classes>
		<class name="assessment.com.au.web.BorrowCalculatorTestClass">
			<methods>
				<include name="methodName1" />
				<include name="methodName2" />
			</methods>
		</class>
	</classes>
	
### Run the all methods from the class: <WebModellingTestClass> pass the class name to be run

	<classes>
		<class name="assessment.com.au.web.BorrowCalculatorTestClass"/>
	</classes>	
	
## Run the tests from eclipse: same testNG.XML file can be use to run the test/tests

Open the project in eclipse
Navigate to Java/Resource and open the testNG.xml file
Right click and choose Run As --> TestNG suit


## selenium - Docker - If you dont want to setup above things tp run the project - you just need to download docker on your local machine
### If you want to run the selenium tests in docker image. You need following configuration change

- Need to update the variable "runOnDocker" to "yes" in config.property file
- Docker must be install and running on you local machine

- pull the docker image selenium/standalone-chrome-debug and run

	- Docker pull selenium/standalone-chrome-debug
	- docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug
		
- if you want to view the execution - download: VNC viewer – for running the web browsers. and following is the configuration
	-  Run the VNC viewer
	- Click on the new connection. 
	- In the VNC server field, enter "http://localhost:5900"
	- Then click on "OK" button
	- It will prompt and ask for the password. By default the password is "secret". Then click on "CONNECT". Then the browser will open. 

Now, if you run the test, you can see execution is started in docker.
