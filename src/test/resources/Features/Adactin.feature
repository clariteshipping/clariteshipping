Feature: Automating the functionalities of Adactin

#Scenario:TC-01 Verifications Adactin Login
 

#Given User wants to open the Adactin application in chrome browser
#When User wants to give valid username and password and click on the login button
#Then User wants to verify the search hotels page opened or not
#When User wants to select location in Adactin application

   
   #Scenario Outline:TC-02 Verifications Adactin Login
 

#Given User wants to open the Adactin application in chrome browser
#When User wants to give valid "<username>" and "<password>" and click on the login button
#Then User verify the login is completed succesfully
#When User give valid details in search hotel

   
  # Examples:
   #|username|password|
   #|Andrew07|UN45LL|
   #|Andrew07|UN45LL| 
   
 Scenario:TC-01 Verifications Adactin Login

Given user wants to open the Adactin Application in chrome browser
When user wants to give valid user name and password using Data Table without header one-D, and click the login button

#one-D without header
|Andrew07|
|UN45LL|   

   
 Given user wants to open the Adactin Application in chrome browser
When user wants to give valid user name and password using Data Table without header Two-D, and click the login button
 @smoke
# Two-D without header
 |Andrew07|welcome |
 |UN45LL|Adactin | 
 Then user wants to verify wether search hotels page opened or not
 
   
 
 
 
 
  