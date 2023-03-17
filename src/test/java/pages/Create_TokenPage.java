package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Create_TokenPage {

    public Response requestCreateToken(String booking){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .when()
                .body(booking)
                .post();
    }
}
