package model;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Test123 {
    @Test
    public void validateJSONSchema(){

        //base URL
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/2";

        //obtain response
        given().relaxedHTTPSValidation()
                .when().get()

                //verify JSON Schema
                .then().assertThat()
                .body(JsonSchemaValidator.
                        matchesJsonSchema(new File("src/test/resources/schema.json")));
        System.out.println("schema: "+JsonSchemaValidator.
                matchesJsonSchema(new File("src/test/resources/schema.json")));
    }
}
