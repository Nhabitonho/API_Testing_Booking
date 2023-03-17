package tests;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Get_BookingPage;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.withArgs;
import static org.hamcrest.Matchers.*;

public class Get_BookingTest extends BaseTest{
    Get_BookingPage get_bookingPage = new Get_BookingPage();

    @BeforeClass
    public void manageBasePath(){
        basePath = "/booking";
    }

    @Test(priority = 1)
    public void getBooking() {
        id = "3078";

        response = get_bookingPage.requestGetBooking(id);
        response.prettyPrint();
        response.then().assertThat()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Content-Length" , "168");
        response.then().body("firstname", containsString("Jim"));
//        response.then().body("$", hasItem("Breakfast"));
        response.then().body("firstname", containsString("J"));

        //check exits
        response.then().assertThat().body("any { it.key == 'firstname' }", is(true));

    }
    @Test(priority = 2)
    public void getBookingIds() {
        response = get_bookingPage.requestBookingIds();
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}
