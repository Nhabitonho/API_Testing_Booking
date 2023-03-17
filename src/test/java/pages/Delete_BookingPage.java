package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Delete_BookingPage {
    public Response requestDeleteBooking(String auth, String id){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", auth)
                .pathParam("id", id)
                .when()
                .delete("/{id}");
    }
}
