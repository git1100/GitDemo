Feature: We will test the Login functionality
Background:
Given the user opens the login page where username, password and submit button are displayed
Scenario:Login with valid credentials
When the user enters username,password and clicks on the Submit button
Then the user should successfully log in to the home page
And the browser should close