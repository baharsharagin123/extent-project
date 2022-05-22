Feature: Action add to cart 
Scenario Outline:
Given user visit dell home page
When user click on "<search product>" 
Then user will be able to land the page

Examples:
|search product|
|XPS 13 Plus Laptop|
