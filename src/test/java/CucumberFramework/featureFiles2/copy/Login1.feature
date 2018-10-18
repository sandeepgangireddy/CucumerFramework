Feature: Login  into account
Existing user should be able to login to account using correct credentials1
     
@smoke
 Scenario: Login into account with correct credentials2
 Given User navigats to stackoverflow website2
 And User clicks on the login button on homepage2
 And User enters a valid username2
 And user enters a valid password2
 When User clicks on the login button2
 Then User should be taken to the successful login page2
