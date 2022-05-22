Feature: Verify product add to cart
Scenario Outline:
Given user visit google home page
When user click on search box and enter"<search box>" and click search icon
Then user will be redirecting to the add to cart page
Examples:
|search box|
|camera|