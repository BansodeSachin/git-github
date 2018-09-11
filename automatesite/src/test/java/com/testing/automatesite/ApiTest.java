package com.testing.automatesite;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTest {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("**********************************************************");
		System.out.println("GET Request started...");
		
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://localhost:8080/spring-crm-rest";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/api/customers");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		
		System.out.println("Status Code is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		
		
		System.out.println("**********************************************************");
		System.out.println("POST Request started...");
		
		RestAssured.baseURI ="http://localhost:8080/spring-crm-rest";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("firstName", "TestFirst5"); // Cast
		requestParams.put("lastName", "TestLast5");
		requestParams.put("email", "testemail@gmail.com");
	 
		request.body(requestParams.toJSONString());
		request.contentType("application/json");
		Response responseForPost = request.post("/api/customers");
	 
		int statusCodeForPost = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCodeForPost);
	 
		System.out.println("Response body: " + responseForPost.body().asString());
		System.out.println("**********************************************************");
	}
}
