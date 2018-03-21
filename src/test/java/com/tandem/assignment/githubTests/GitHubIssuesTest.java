package com.tandem.assignment.githubTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import javax.security.sasl.AuthorizeCallback;

public class GitHubIssuesTest
{
	 int milestone = 1;
	 String assignee = "testAccount239";
	 String [] labels = {"bug"};
	 final String token = "851eeb34166b78fb50c55da71bec8d2c90ea1859";
	 final String accountName = "testAccount239";
	 final String repoName = "testRepo";
	 
	 
//@Test
 public void createIssue() {
	 
	Issue myIssue = new Issue("Brand New Issue", "Now this is how you create another issue", milestone, labels,assignee);
	
	given().
	contentType("application/json").body(myIssue).authentication().oauth2(token)

	.when().post("https://api.github.com/repos/testAccount239/testRepo/issues") 
	.then().assertThat().statusCode(201)
	.and().assertThat().body(equalTo("{\"body\":\"Now this is how you create an issue\"}"));
	
}
//@Test 
public void editIssue() {
	

Issue myIssue = new Issue("Patch Issue", "Now this is how you create another issue", milestone, labels,assignee);
	
	given().
	contentType("application/json").body(myIssue).authentication().oauth2(token)

	.when().patch("https://api.github.com/repos/testAccount239/testRepo/issues/9") 
	.then().assertThat().statusCode(201);
	//.and().assertThat().body(equalTo("{\"body\":\"Now this is how you create an issue\"}"));
}
@Test
public void getIssues() {

Issue myIssue = new Issue("created", "all", "bug", "updated", "desc", "");
	
	given().
	contentType("application/json").authentication().oauth2(token)

	.when().get("https://api.github.com/repos/testAccount239/testRepo/issues") 
	.then().assertThat().statusCode(200);
	
	//.and().assertThat().body(equalTo("{\"body\":\"Now this is how you create an issue\"}"));

}
	}

