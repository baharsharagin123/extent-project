Feature: Laptop add to cart on dell
@Sm
Scenario Outline:

Given user visit dell home page
When user type "<search>" on  search bar and click on search button 
Then user will be land on the page

Examples:
|search	           |
|Inspiron 15 Laptop|
