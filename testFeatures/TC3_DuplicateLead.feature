Feature: Duplicate a Lead in LeafTaps

@functional
Scenario Outline: Duplicate an Existing Lead

When Click on 'Leads'
When Click on 'Find Leads' button
When Click Email link
Given Enter Email Address as <email>
When Click on Find Lead to get results
Then Click on First result and get FirstName
When Click on Duplicate Lead
When Click on submit button
Then Check and confirm the Duplicate Lead

Examples:
|firstName|email|
|'Ramar'|'manvelhero@rocketmail.com'|