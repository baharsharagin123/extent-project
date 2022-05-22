Feature: Dell sign in

Scenario Outline:
Given user visit dell home page
When user enter "<First name>" and "<Last name>" and valid "<email address>" and "<new password>" 
Then user click on create account
Examples:
|First name| Last name| email address   |new password|
|Amy       | Bari     |esdy@gmail.com   |Taposh@12  |




