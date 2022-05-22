Feature: Verify dell sign in

Scenario Outline:
Given user visit dell home page
When user enter "<email address>" and valid "<password>" and click sign in
Then user will be able to land sign in page

Examples:
| email address|password|
|esdy@gmail.com |Taposh@12|