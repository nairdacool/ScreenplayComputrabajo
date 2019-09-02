#Author: your.email@your.domain.com


Feature: Computrabajo sign in
 As a user I want to sign in on computrabajo website to look for a job
 
Background: 
		Given Adrian opens a web browser

  @tag1
  Scenario Outline: Computrabajo sign in
    Given Adrian enters to Computrabajo website on sign in area
    When Adrian fill out the registration form with the next data
    | name   | surname   | email   | password   | position   | location   |
    | <name> | <surname> | <email> | <password> | <position> | <location> |
    Then Adrian validates that email is registered
 
    
   Examples:
    		| name   | surname  | email          							| password | position     | location 		|
    	  | Adrian | trujillo | ashdgjasdsahgd2@hotmail.com | 2568854  | Test Analyst | Antioquia   |
