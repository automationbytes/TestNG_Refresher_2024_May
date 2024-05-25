package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostReq_AsString {
    @Test
    public void PostReq(){
        String rbody =
    """
            {
              "description": "New Devlabs Coffee is good",
              "name": "New DevLabs Cafe"
            }""";

        System.out.println(rbody);

        RestAssured.baseURI = "https://webservice.toscacloud.com";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(rbody)
                .when()
                .post("/api/v1/Coffees")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
