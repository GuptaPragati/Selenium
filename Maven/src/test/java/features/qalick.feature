Feature: Login into qaclick application

Scenario Outline: Positive test validating login
Given Initialize browser with chrome
And Navigate to "http://qaclickacademy.com/" sites
And Click on login link in home page to land on Secure sign in page
When User enters <username> and <password> and logs in
Then verify that user is successfully logged in

Examples:
|username				|password	|
|test99@gmail.com		|123456		|
|test123gmail.com		|12345		|