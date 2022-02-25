# Orange_Task_GooglePlay
# Prerequisites
- Java JDK 
- Maven (to run from command line)
- TestNG
# Libraries
- Selenium 
- WebDriver Manger
# Usage 
 - download the source code and import it into your IDE
 - to run the complete suite of tests , run the TestNG.xml file 
 - or you can run individual tests by running their recpective test class
 # To run by xml file 
 - mvn clean test -DsuiteXmlFile=TestRun.xml‏
 # Content 
 - This project contain
    - TED scenario
       - First test case
          - User can open apps
             - navigate "https://play.google.com/store"
             - click on apps
       - Second test case 
          - User can select education from category
             - click on category 
             - select education
       - Third test case 
          - User can search for TED application
             - write TED in search textbox
             - click on search button
       - Fourth test case 
          - User can Select for TED application
             -click on TED application
    - Facebook Scenario 
       - First test case 
          - User can search for facebook 
             - navigate "https://play.google.com/store"
             - write Facebook in search textbox
             
