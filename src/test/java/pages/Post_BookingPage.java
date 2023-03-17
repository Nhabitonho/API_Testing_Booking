package pages;

import io.restassured.response.Response;
import model.BookingInfo;

import static io.restassured.RestAssured.given;

public class Post_BookingPage {
    public Response requestCreateBooking(String booking){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .body(booking)
                .when()
                .post();
    }

    public Response requestCreateBooking1(BookingInfo booking){
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .body(booking)
                .when()
                .post();
    }
}
