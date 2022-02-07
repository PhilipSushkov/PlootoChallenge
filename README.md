PlootoChallenge
==============

**Platform, tools and libraries**

Windows 10, Java 11, Selenium, WebDriver, TestNG, Cucumber, Maven, IntelliJ IDEA Community Edition, 
Google Chrome browser v98, Chrome Driver v98, GitHub, Git

Possible to run on *MacOS* with some specific settings

**Setup the environment**

1. Install *IntelliJ IDEA Community Edition* https://www.jetbrains.com/idea/download/#section=windows
2. Update *Google Chrome* browser up to the version 98
3. Install *Java 11* https://www.oracle.com/ca-en/java/technologies/javase/jdk11-archive-downloads.html for Windows or MacOS
   How to Check if Java 11 is Installed correctly https://www.baeldung.com/java-check-is-installed
4. Install *Maven* https://www.baeldung.com/install-maven-on-windows-linux-mac. 
   You can verify if Maven installed correctly by `mvn -version` 
5. Download *PlootoChallenge* test suite from GitHub repo https://github.com/PhilipSushkov/PlootoChallenge or 
unpack *.zip* file provided on your local computer
6. You may use *GitHub Desktop* https://desktop.github.com/ and *Git* https://git-scm.com/downloads to establish the repo connection
7. Open *PlootoChallenge* project in *IntelliJ IDEA* or in your local folder and make sure you have *chromedriver.exe*
file in the root (if you use *MacOS*: download and put *chromedriver* https://chromedriver.chromium.org/downloads). 
Verify that you use the correct version of *ChromeDriver* to match your Chrome browser

**Project structure**
1. `src\test\resources\features` - contains Cucumber *.feature* files with test scenarios and test cases description:
  - Login
  - Company Selection
  - Dashboard
  - Payment Approvals
  - Pending Payments
  - Payment Approval
2. `src\test\resources\features` - *IntelliJ IDEA* service files
3. `pom.xml` - *Maven* configuration file
4. `src\test\java\TestRunner` - contains the runner configuration file
5. `src\test\java\StepDefs` - *Step Definition* files which contain Java classes and define the steps for annotations 
created in *.feature* file. Use *TestNG* framework library.
6. `src\test\java\utils` - contains *Utility* files for the shared service code. 
`Spec.java` class defines WebDriver instance. Switch *Chrome WebDriver* file to MacOS if you use this OS.
7. `testng.xml` - *TestNG* running file. You may change the number of threads there using *thread-count*
and *data-provider-thread-count* parameters. Initially 3 threads are set up to run in parallel.

**How to run**
1. Make sure you are in the root project folder `PlootoChallenge`
2. Run `mvn test` in the command line 
3. *Maven* should run and update all required Java libraries from *Maven* repo
4. You should get *BUILD SUCCESS* message at the end
5. All together 6 Scenarios and 45 steps should pass during ~15-20 sec
6. *Cucumber* test descriptions should be displayed in the log for each scenario
7. More about *Maven* commands see here http://tutorials.jenkov.com/maven/maven-commands.html
