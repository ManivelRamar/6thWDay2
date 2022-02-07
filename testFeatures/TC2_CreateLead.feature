Feature: LeafTaps lead creation functionalities

@functional
Scenario Outline: Create Lead in the testleaf site

When Click on 'Leads'
When Click on 'Create Lead' link
When Click on Company name and enter <company>
When Click on First name and enter <fName>
When Click on Last name and enter <lName>
When Click on email and enter <email>
When Click on 'submitButton' option
Then View Lead page shoud be displayed

Examples:
|company|fName|lName|email|
|'Tech Mahindra'|'Ramar'|'Manivel'|'manvelhero@rocketmail.com'|

