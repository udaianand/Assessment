Feature: Login feature

Scenario: Login Test Scenario

Given user is on login page
When title of login page is MercuryTours
Then user enter username and password
Then user logins
Then user is on homepage
Then user exits application