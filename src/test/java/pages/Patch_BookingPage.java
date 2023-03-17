package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Patch_BookingPage {
    public Response requestPartialUpdateBooking(String booking, String auth, String id){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", auth)
                .body(booking)
                .pathParam("id", id)
                .when()
                .patch("/{id}");
    }
}
