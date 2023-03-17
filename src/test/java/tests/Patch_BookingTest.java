package tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Patch_BookingPage;

public class Patch_BookingTest extends BaseTest {
    Patch_BookingPage partialUpdate_bookingPage = new Patch_BookingPage();

    @BeforeClass
    public void manageBasePath(){
//        basePath = "/booking";
    }

    @Test
    public void partialUpdateBooking() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("firstname", "Jim");
        requestbody.put("lastname", "Brown");

        JSONArray jsonArrayPayload = new JSONArray();
        jsonArrayPayload.add(requestbody);

        response = partialUpdate_bookingPage.requestPartialUpdateBooking(String.valueOf(requestbody), auth, id);
        System.out.println("Response: ");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}
