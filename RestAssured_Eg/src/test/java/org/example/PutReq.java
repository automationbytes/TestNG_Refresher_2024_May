package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutReq {
    public static void main(String[] args) {
        String rbody =
                """
                        {
                          "description": "New Devlabs Coffee is good",
                          "name": "New DevLabs Cafe",
                          "id":110
                        }""";

        System.out.println(rbody);

        RestAssured.baseURI = "https://webservice.toscacloud.com";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(rbody)
                .when()
                .put("/api/v1/Coffees")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
