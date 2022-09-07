
Feature: API tests from a Public API ReqRes.in
  This file is used to cover get,post,put and delete from the the API ReqRes.in


Scenario: User is able to get the details of a specific user
    Given User is able to get the list of all users
    When User tries to get details of a specifc user
    Then User is able to get the details of a specific user
    And Validate the userID in response
    
Scenario: User is able to create a New User
    When User tries to create a New User
    Then New User is created 
    And validates the userID in response for Newly Created User
    
Scenario: User is able to updates the details of a user
    When User tries to updates the details of a user
    Then USer details are updated
    
Scenario: User is able to delete the details of a user
    When User tries to delete the details of a user
    Then USer details are deleted
    
    

