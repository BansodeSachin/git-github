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

public class Logintest {
	
	public static void main(String args[]) throws InterruptedException
	{
		/*WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://shreesharemarket.in/avs/avs/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginId")).sendKeys("E1803003");
		driver.findElement(By.id("loginPassword")).sendKeys("sachin");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
		driver.findElement(By.linkText("Add New Lead")).click();
		driver.findElement(By.id("agentName")).sendKeys("test");
		driver.findElement(By.id("center_code")).sendKeys("test");
		driver.findElement(By.id("medId")).sendKeys("test");
		driver.findElement(By.id("ppoId")).sendKeys("test");
		
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();*/
		
		System.out.println("**********************************************************");
		System.out.println("GET Request started...");
		
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		
		System.out.println("Status Code is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		
		
		System.out.println("**********************************************************");
		System.out.println("POST Request started...");
		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Sachin"); // Cast
		requestParams.put("LastName", "Bansode");
		requestParams.put("UserName", "bansodesachin");
		requestParams.put("Password", "sachin123");	
		requestParams.put("Email",  "bansodesachin0@gmail.com");
	 
		request.body(requestParams.toJSONString());
		Response responseForPost = request.get("/register");
	 
		int statusCodeForPost = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCodeForPost);
	 
		System.out.println("Response body: " + responseForPost.body().asString());
		System.out.println("**********************************************************");
	}
}
