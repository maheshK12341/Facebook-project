
Feature: login feature
We need validate the login feature test sceanrios

@smoke
 Scenario: Validate the login functionality with Invalid username and password
Given user is on  login page
When user enters valid username "Testing@gmail.com"
And user enters valid password "P244@##$"
And clicks on submit

@smoke
Scenario Outline: Validate the login functionality with valid username and password
 
 Given user is on  login page
 When user enters valid usernameM "<username>"
 And user enters valid passwordM "<password>"
And clicks on submit
 
 Examples: 
|username|password|
|kphp@gmailcom|P3234#$$$|
|selenium@gmaillcom|P334sdTet|