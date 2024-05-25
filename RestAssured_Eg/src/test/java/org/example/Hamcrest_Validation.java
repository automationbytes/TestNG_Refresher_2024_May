package org.example;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Hamcrest_Validation {

    @Test
    public void usingAssertion(){

        RestAssured.baseURI = "https://webservice.toscacloud.com";

        RestAssured
                .given() //header
                .when() //actual action
                .get("/api/v1/Coffees")
                .then() //validation
                .statusCode(200)
                .assertThat()
                .body("description[1]",containsString("Bicerin"))
                .body("id",hasItem(1))
                .body("id",hasItems(1,5,20));



    }

}
