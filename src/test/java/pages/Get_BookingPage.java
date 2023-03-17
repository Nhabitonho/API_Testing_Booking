package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Get_BookingPage {
    public Response requestGetBooking(String id){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .when()
                .pathParam("id", id)
                .get("/{id}");
    }
    public Response requestBookingIds(){
        return given()
                .relaxedHTTPSValidation()
                .queryParam("firstname", "Jim")
                .queryParam("lastname", "Brown")
                .get();
    }
}
