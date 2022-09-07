package stepDefinitions;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Steps {

	private static final String base_url = "https://reqres.in/api";

	private static Response response;
	private static String jsonString;
	
	@Given("User is able to get the list of all users")
	public void user_is_able_to_get_the_list_of_all_users() {
		RestAssured.baseURI = base_url;
		RequestSpecification request = RestAssured.given();
		response = request.get("/users");

		jsonString = response.asString();
		System.out.println(jsonString);
		int totalUserIDs = JsonPath.from(jsonString).get("total");
		System.out.println("totalUserIDs : " + totalUserIDs);
		Assert.assertTrue(totalUserIDs > 0);

	}

	@When("User tries to get details of a specifc user")
	public void user_tries_to_get_details_of_a_specifc_user() {
		RestAssured.baseURI = base_url;
		RequestSpecification request = RestAssured.given();
		response = request.get("/users/2");
		int statusCode = response.getStatusCode();
		System.out.println("statusCode : " + statusCode);
		Assert.assertTrue(statusCode == 200);
	}

	@Then("User is able to get the details of a specific user")
	public void user_is_able_to_get_the_details_of_a_specifc_user() {
		jsonString = response.asString();
		System.out.println(jsonString);
		String emailIDResponse = JsonPath.from(jsonString).get("data.email");
		System.out.println("emailIDResponse : " + emailIDResponse);
		Assert.assertTrue((emailIDResponse.contains("reqres.in")==true));

	}

	@Then("Validate the userID in response")
	public void validates_the_userID_in_response() {
		int userIDResponse = JsonPath.from(jsonString).get("data.id");
		System.out.println("userIDResponse : " + userIDResponse);
		Assert.assertTrue(userIDResponse == 2);

	}
	
	
	@When("User tries to create a New User")
	public void user_tries_to_create_a_New_User() {
		RestAssured.baseURI = base_url;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("name", "Sourabh"); 
		requestParams.put("job", "QA"); 
		request.body(requestParams.toString());
		response = request.post("/users");
		jsonString = response.asString();
		System.out.println(jsonString);
	}
	
	
	@Then("New User is created")
	public void new_User_is_created() {
		int statusCodePost = response.getStatusCode();
		System.out.println("statusCodePost : " + statusCodePost);
		Assert.assertTrue(statusCodePost == 201);
		String createdAtTime = JsonPath.from(jsonString).get("createdAt");
		System.out.println("createdAtTime : " + createdAtTime);
		Assert.assertTrue((createdAtTime.contains(":"))==true);

	}

	@Then("validates the userID in response for Newly Created User")
	public void validates_the_userID_in_response_for_Newly_Created_User() {
		String userIDResponsePost = JsonPath.from(jsonString).get("id");
		System.out.println("userIDResponsePost : " + userIDResponsePost);
		int userIDResponsePostInInt=Integer.parseInt(userIDResponsePost);
		Assert.assertTrue(userIDResponsePostInInt > 0);

	}
	
	@When("User tries to updates the details of a user")
	public void user_tries_to_updates_the_details_of_a_user() {
		RestAssured.baseURI = base_url;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("name", "Sourabh"); 
		requestParams.put("job", "AutomationQA"); 
		request.body(requestParams.toString());
		response = request.put("/users/2");
		jsonString = response.asString();
		System.out.println(jsonString);

	}

	@Then("USer details are updated")
	public void user_details_are_updated() {
		int statusCodePut = response.getStatusCode();
		System.out.println("statusCodePut : " + statusCodePut);
		Assert.assertTrue(statusCodePut == 200);
		String updatedAtTime = JsonPath.from(jsonString).get("updatedAt");
		System.out.println("createdAtTime : " + updatedAtTime);
		Assert.assertTrue((updatedAtTime.contains(":"))==true);

	}
	
	
	@When("User tries to delete the details of a user")
	public void user_tries_to_delete_the_details_of_a_user() {
		RestAssured.baseURI = base_url;
		RequestSpecification request = RestAssured.given();
		response = request.delete("/users/2");

	}

	@Then("USer details are deleted")
	public void user_details_are_deleted() {
		int statusCodeDelete = response.getStatusCode();
		System.out.println("statusCodeDelete : " + statusCodeDelete);
		Assert.assertTrue(statusCodeDelete == 204);

	}


	    
}
