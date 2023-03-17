package tests;

import model.BookingInfo;
import model.Dates;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Post_BookingPage;

import static io.restassured.RestAssured.basePath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Post_BookingTest extends BaseTest {

    Post_BookingPage create_bookingPage = new Post_BookingPage();

    @BeforeClass
    public void manageBasePath() {
        basePath = "/booking";
    }

    @Test(priority = 1)
    public void createBooking() {

//        Map<String, Object> requestbody = new HashMap<String, Object>();
        JSONObject requestbody = new JSONObject();
        requestbody.put("firstname", "Jim");
        requestbody.put("lastname", "Brown");
        requestbody.put("totalprice", "111");
        requestbody.put("depositpaid", "true");

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2021-07-10");
        bookingDates.put("checkout", "2021-07-10");
        requestbody.put("bookingdates", bookingDates);
        requestbody.put("additionalneeds", "Breakfast");

        JSONArray jsonArrayPayload = new JSONArray();
        jsonArrayPayload.add(requestbody);


        response = create_bookingPage.requestCreateBooking(String.valueOf(requestbody));
        String name = response.jsonPath().getString("booking.firstname");
        System.out.println(name);
        //        System.out.println("Response :" + response.asString());
//        Assert.assertEquals(200, response.getStatusCode());
//        Assert.assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data.email"));
//        assertTrue(response.jsonPath().getString("data.first_name").contains("Jim"));

        assertEquals(name, "Jim");

        System.out.println("Response: ");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
        id = response.jsonPath().getString("bookingid");
        System.out.println(id);
    }
    @Test(priority = 2)
    public void createBooking1() {

        BookingInfo booking = new BookingInfo();
        booking.setFirstname("Jim1");
        booking.setLastname("Brown1");
        booking.setTotalprice("111");
        booking.setDepositpaid(true);
        Dates date = new Dates();
        date.setCheckin("2022-01-01");
        date.setCheckout("2023-01-01");
        booking.setBookingdates(date);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        response = create_bookingPage.requestCreateBooking1(booking);

        response.prettyPrint();
        System.out.println(response.getStatusCode());
        id = response.jsonPath().getString("bookingid");
//        String name = response.jsonPath().getString("booking.firstname");
        System.out.println(id);
//        assertEquals(, equals("Jim1"));
    }
}
