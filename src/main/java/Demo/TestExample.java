package Demo;//package tests;
//
//import model.BookingInfo;
//import model.Dates;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.testng.annotations.Test;
//
//import static io.restassured.RestAssured.basePath;
//
//public class TestExample extends BaseTest {
//
//
//
//    @Test(priority = 1)
//    public void createToken() {
//        basePath = "/auth";
//        String requestBody = "{\n"
//                + "   \"username\": \"admin\", \n"
//                + "   \"password\": \"password123\"\n"
//                + "}";
//        response = getBooking.requestCreateToken(requestBody);
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 2)
//    public void getBookingIds() {
//        basePath = "/booking";
//        response = getBooking.requestBookingIds();
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 3)
//    public void getBooking() {
//        basePath = "/booking";
//        id = "1";
//
//        response = getBooking.requestGetBooking(id);
//
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 4)
//    public void createBooking() {
//        basePath = "/booking";
//
////        Map<String, Object> requestbody = new HashMap<String, Object>();
//        JSONObject requestbody = new JSONObject();
//        requestbody.put("firstname", "Jim");
//        requestbody.put("lastname", "Brown");
//        requestbody.put("totalprice", "111");
//        requestbody.put("depositpaid", "true");
//
//        JSONObject bookingDates = new JSONObject();
//        bookingDates.put("checkin", "2021-07-10");
//        bookingDates.put("checkout", "2021-07-10");
//        requestbody.put("bookingdates", bookingDates);
//        requestbody.put("additionalneeds", "Breakfast");
//
//        JSONArray jsonArrayPayload = new JSONArray();
//        jsonArrayPayload.add(requestbody);
//
//
//        response = getBooking.requestCreateBooking(String.valueOf(requestbody));
//
//        System.out.println("Response: ");
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//        id = response.jsonPath().getString("bookingid");
//        System.out.println(id);
//    }
//
//    @Test(priority = 5)
//    public void updateBooking() {
//        basePath = "/booking";
//        System.out.println(id);
//
//        JSONObject requestbody = new JSONObject();
//        requestbody.put("firstname", "James");
//        requestbody.put("lastname", "Brownnn");
//        requestbody.put("totalprice", "111");
//        requestbody.put("depositpaid", "true");
//
//        JSONObject bookingDates = new JSONObject();
//        bookingDates.put("checkin", "2021-07-10");
//        bookingDates.put("checkout", "2021-07-10");
//        requestbody.put("bookingdates", bookingDates);
//        requestbody.put("additionalneeds", "Breakfast");
//
//        JSONArray jsonArrayPayload = new JSONArray();
//        jsonArrayPayload.add(requestbody);
//
//        response = getBooking.requestUpdateBooking(String.valueOf(requestbody), auth, id);
//        System.out.println("Response: ");
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 6)
//    public void partialUpdateBooking() {
//        JSONObject requestbody = new JSONObject();
//        requestbody.put("firstname", "Jim");
//        requestbody.put("lastname", "Brown");
//
//        JSONArray jsonArrayPayload = new JSONArray();
//        jsonArrayPayload.add(requestbody);
//
//        response = getBooking.requestPartialUpdateBooking(String.valueOf(requestbody), auth, id);
//        System.out.println("Response: ");
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 7)
//    public void deleteBooking() {
//        basePath = "/booking";
//        response = getBooking.requestDeleteBooking(auth, id);
//        System.out.println(response.getStatusCode());
//    }
//
//    @Test(priority = 8)
//    public void createBooking1() {
//        basePath = "/booking";
//
//        BookingInfo booking = new BookingInfo();
//        booking.setFirstname("Jim1");
//        booking.setLastname("Brown1");
//        booking.setTotalprice("111");
//        booking.setDepositpaid(true);
//        Dates date = new Dates();
//        date.setCheckin("2022-01-01");
//        date.setCheckout("2023-01-01");
//        booking.setBookingdates(date);
//        booking.setAdditionalneeds("Breakfast");
//
//        System.out.println(booking);
//        response = getBooking.requestCreateBooking1(booking);
////        response = RestAssured.given()
////                .relaxedHTTPSValidation()
////                .header("Content-Type", "application/json")
////                .body(booking)
////                .when()
////                .post();
//
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//        id = response.jsonPath().getString("bookingid");
////        String name = response.jsonPath().getString("booking.firstname");
//        System.out.println(id);
////        assertEquals(, equals("Jim1"));
//    }
//}
//
