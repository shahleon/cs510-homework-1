## Building, Running, and Running

### Install Java and Maven
Install [Java](https://www.java.com/en/download/help/download_options.html) and set [JAVA_HOME](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)

Install [Maven](https://maven.apache.org/install.html)


### Build Project
```console
$ mvn clean package
...
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< groupId:cs510-homework-1 >----------------------
[INFO] Building cs510-homework-1 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
...
[INFO]
[INFO] --- maven-jar-plugin:3.1.0:jar (default-jar) @ cs510-homework-1 ---
[INFO] Building jar: /Users/Leon/workspace/cs510-se/homework/target/cs510-homework-1-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.876 s
[INFO] Finished at: 2022-08-28T23:11:17-04:00
[INFO] ------------------------------------------------------------------------
```

### Run Project
```console
$ java -jar target/cs510-homework-1-1.0-SNAPSHOT.jar
The first number is: 
40
Number 1 is 40.0
Enter operator: +, -, * or /
+
The second number is:
10
Number 2 is 10.0
Result is: 50.0
Continue? Y/N
```

### Run Tests
```console
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.CalculatorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.06 s - in com.CalculatorTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.893 s
[INFO] Finished at: 2022-08-28T23:28:44-04:00
[INFO] ------------------------------------------------------------------------
```