package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getReq {
    @Test
    public void getReqEg() {
        RestAssured.baseURI = "https://webservice.toscacloud.com";

        Response response = RestAssured
                .given() //header
                .when() //actual action
                .get("/api/v1/Coffees")
                .then() //validation
                .extract()
                .response();

        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
    }


        @Test
                public void usingAssertion(){

            RestAssured.baseURI = "https://webservice.toscacloud.com";

            RestAssured
                    .given() //header
                    .when() //actual action
                    .get("/api/v1/Coffees")
                    .then() //validation
                    .statusCode(400);


        }

}
