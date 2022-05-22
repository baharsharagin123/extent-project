Feature: Verify add to cart
Scenario Outline: 
Given user visit amazon home page
When user enter "<search word>" and click on search icon and click book and click add to cart
Then user will be able to add book in the cart
Examples:
|search word|
|story book collection |