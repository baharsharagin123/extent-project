Feature: Verify Macbook pro on apple home page
Scenario Outline:
Given user apple home page
When user enter"<search word>" and after getting add to bag select arabic language and click review bag
Then user  will be able to redirect on  the total price page

Examples:
|search word|price|language|
|macbookpro|2000.50|arabic|


