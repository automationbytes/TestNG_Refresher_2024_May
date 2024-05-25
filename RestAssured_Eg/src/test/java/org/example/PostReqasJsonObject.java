package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class PostReqasJsonObject {
    public static void main(String[] args) {

            JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","Post request using Hash Map");
        jsonObject.put("Name","Post Req HashMap");

           // JSONObject jsonObject = new JSONObject(hashMap);


            System.out.println(jsonObject);

            RestAssured.baseURI = "https://webservice.toscacloud.com";
            Response response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .and()
                    .body(jsonObject.toString())
                    .when()
                    .post("/api/v1/Coffees")
                    .then()
                    .extract()
                    .response();

            System.out.println(response.asPrettyString());
            System.out.println(response.statusCode());

        }

}
