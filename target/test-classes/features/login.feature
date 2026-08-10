Feature: Login Functionality

Scenario Outline: User is able to login into the application using Annotations 
Given user open the application "<url>"
When user click login link
And user enter username as "<username>" and password as "<password>"
And user clicks the login button
Then verify the logged in user as "<username>"
Examples:
| url 							   | username | password |
| https://demoblaze.com/index.html | pavanol  | test@123 |