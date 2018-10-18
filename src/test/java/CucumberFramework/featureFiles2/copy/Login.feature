Feature: Login  into account
Existing user should be able to login to account using correct credentials

@important     
 Scenario: Login into account with correct credentials
 Given User navigats to stackoverflow website 
 And User clicks on the login button on homepage 
 And User enters a valid username
 And user enters a valid password
 When User clicks on the login button
 Then User should be taken to the successful login page
