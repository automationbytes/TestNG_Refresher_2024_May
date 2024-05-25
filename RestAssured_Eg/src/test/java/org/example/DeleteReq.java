package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteReq {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://webservice.toscacloud.com";

        Response response = RestAssured
                .given() //header
                .when() //actual action
                .delete("/api/v1/Coffees?id=110")
                .then() //validation
                .extract().response()
                ;
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
