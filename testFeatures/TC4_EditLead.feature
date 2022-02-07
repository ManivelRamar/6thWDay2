Feature: LeafTaps Edit functionalities

@smoke
Scenario Outline: Find and Edit Lead in the testleaf site

When Click on 'Leads'
When Click on 'Find Leads'
When ed_Enter first name <fName>
When ed_Click on Find Lead to get results
Then ed_Click on First result
When ed_Click on Edit
Then ed_Update Company name as <company>
When Click on 'submitButton' option
Then ed_Check the company name get updated


Examples:
|company|fName|
|'AirAsiaTechTeam'|'Manivel'|