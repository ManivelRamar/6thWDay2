Feature: LeafTaps delete functionalities

@sanity
Scenario Outline: Find and Delete Lead in the testleaf site

When Click on 'Leads'
When Click on 'Find Leads'
When Click on First Name and enter the <name>
When Click on Find Lead Button
Then Save First resulting field data and Click it
When Click on Delete
When Click again Find Leads
When Enter the leadID
Then Verify there is no records to display




Examples:
|name|
|'Manivel'|