Feature: Application Login

Scenario: Login with valid credentials
Given open any Browser
And Navigate to login Page
When User enters username as "deep123@gmail.com" and password as "test123" into the fields
And User click on Login Button
Then Verify user is able to successfully login

