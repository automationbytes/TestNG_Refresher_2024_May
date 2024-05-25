package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class E2E {

    int id = 0;
    @Test(priority = 1)
    public void PostReq(){
        HashMap hashMap = new HashMap();
        hashMap.put("Description","Post request using Hash Map for e2e scenario");
        hashMap.put("Name","Post Req HashMap for e2e");

        JSONObject jsonObject = new JSONObject(hashMap);


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
        id = response.jsonPath().getInt("id");
        System.out.println(id);
    }
    @Test(priority = 2)
    public void getReqEg() {
        RestAssured.baseURI = "https://webservice.toscacloud.com";

        Response response = RestAssured
                .given() //header
                .when() //actual action
                .get("/api/v1/Coffees/"+id)
                .then() //validation
                .extract()
                .response();

        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 3)
    public void PuttReq(){
        HashMap hashMap = new HashMap();
        hashMap.put("Description","Updated Post request using Hash Map for e2e scenario");
        hashMap.put("Name","Updated Post Req HashMap for e2e");
        hashMap.put("id",id);

        JSONObject jsonObject = new JSONObject(hashMap);


        System.out.println(jsonObject);

        RestAssured.baseURI = "https://webservice.toscacloud.com";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(jsonObject.toString())
                .when()
                .put("/api/v1/Coffees")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
        id = response.jsonPath().getInt("id");
        System.out.println(id);
    }
    @Test(priority = 4)
    public void getReq_afterPut() {
        RestAssured.baseURI = "https://webservice.toscacloud.com";

        Response response = RestAssured
                .given() //header
                .when() //actual action
                .get("/api/v1/Coffees/"+id)
                .then() //validation
                .extract()
                .response();

        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
    }


}
