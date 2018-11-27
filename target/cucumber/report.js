$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckTitleAfterLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Check Title after Logging in",
  "description": "Existing user should be able to login to account using correct credentials and check the Title of the page",
  "id": "check-title-after-logging-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8215442396,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "check-title-after-logging-in;login-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigate to stackoverflow website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Title of the page is correct",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_navigate_to_stackoverflow_website()"
});
formatter.result({
  "duration": 5291244314,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "duration": 1814147007,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 6144005002,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_password()"
});
formatter.result({
  "duration": 3072468324,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 275162333,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 3385657098,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.Title_of_the_page_is_correct()"
});
formatter.result({
  "duration": 3011841511,
  "status": "passed"
});
formatter.after({
  "duration": 832937934,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Correct Credentials Login  into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "correct-credentials-login--into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7406452109,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "correct-credentials-login--into-account;login-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User navigate to stackoverflow website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigate_to_stackoverflow_website()"
});
formatter.result({
  "duration": 3590294636,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "duration": 1622300630,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 6113830493,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_password()"
});
formatter.result({
  "duration": 3078241394,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 276717388,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 3149516195,
  "status": "passed"
});
formatter.after({
  "duration": 913563166,
  "status": "passed"
});
formatter.uri("LoginFail.feature");
formatter.feature({
  "line": 1,
  "name": "Wrong Credentials Login  into account",
  "description": "Invalid user should not be able to login to account using incorrect credentials",
  "id": "wrong-credentials-login--into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6813582672,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with incorrect credentials",
  "description": "",
  "id": "wrong-credentials-login--into-account;login-into-account-with-incorrect-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigate to stackoverflow website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters an invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should not be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigate_to_stackoverflow_website()"
});
formatter.result({
  "duration": 3711373117,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "duration": 1395926995,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 6158668590,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_an_invalid_password()"
});
formatter.result({
  "duration": 3081354290,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1378414044,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_not_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 6060011610,
  "status": "passed"
});
formatter.after({
  "duration": 816662695,
  "status": "passed"
});
});