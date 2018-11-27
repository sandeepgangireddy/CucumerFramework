Feature: Wrong Credentials Login  into account
Invalid user should not be able to login to account using incorrect credentials

 Scenario: Login into account with incorrect credentials
 Given User navigate to stackoverflow website  
 And User clicks on the login button on homepage 
 And User enters a valid username
 And user enters an invalid password
 When User clicks on the login button
 Then User should not be taken to the successful login page