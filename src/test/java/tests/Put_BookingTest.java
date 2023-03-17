package tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Put_BookingPage;

import static io.restassured.RestAssured.basePath;

public class Put_BookingTest extends BaseTest {

    Put_BookingPage update_bookingPage = new Put_BookingPage();

    @BeforeClass
    public void manageBasePath(){
        basePath = "/booking";
    }
    @Test(priority = 5)
    public void updateBooking() {
        System.out.println("bookingId: "+id);

        JSONObject requestbody = new JSONObject();
        requestbody.put("firstname", "James");
        requestbody.put("lastname", "Brownnn");
        requestbody.put("totalprice", "111");
        requestbody.put("depositpaid", "true");

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2021-07-10");
        bookingDates.put("checkout", "2021-07-10");
        requestbody.put("bookingdates", bookingDates);
        requestbody.put("additionalneeds", "Breakfast");

        JSONArray jsonArrayPayload = new JSONArray();
        jsonArrayPayload.add(requestbody);

        response = update_bookingPage.requestUpdateBooking(String.valueOf(requestbody), auth, id);
        System.out.println("Response: ");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}
