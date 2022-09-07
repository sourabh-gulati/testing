$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTesting/apiTest.feature");
formatter.feature({
  "name": "API tests from a Public API ReqRes.in",
  "description": "  This file is used to cover get,post,put and delete from the the API ReqRes.in",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is able to get the details of a specific user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is able to get the list of all users",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_able_to_get_the_list_of_all_users()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User tries to get details of a specifc user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_tries_to_get_details_of_a_specifc_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to get the details of a specific user",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_able_to_get_the_details_of_a_specifc_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the userID in response",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.validates_the_userID_in_response()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to create a New User",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User tries to create a New User",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_tries_to_create_a_New_User()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New User is created",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.new_User_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates the userID in response for Newly Created User",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.validates_the_userID_in_response_for_Newly_Created_User()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to updates the details of a user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User tries to updates the details of a user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_tries_to_updates_the_details_of_a_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer details are updated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_details_are_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to delete the details of a user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User tries to delete the details of a user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_tries_to_delete_the_details_of_a_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer details are deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_details_are_deleted()"
});
formatter.result({
  "status": "passed"
});
});