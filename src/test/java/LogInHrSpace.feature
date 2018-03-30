@HRA
Feature: LoginHRA Action

Scenario: Successful Login
	Given User is on HomePage
	When User Navigate to Log
	And User enters identifiers
	Then Login Successfully