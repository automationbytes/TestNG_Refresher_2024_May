package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

public class UsingPojo {

    public static void main(String[] args) {

        PojoReqBdy pojoReqBdy = new PojoReqBdy();
        pojoReqBdy.setDescription("Pojo description");
        pojoReqBdy.setName("Pojo name");

        RestAssured.baseURI = "https://webservice.toscacloud.com";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(pojoReqBdy)
                .when()
                .post("/api/v1/Coffees")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
