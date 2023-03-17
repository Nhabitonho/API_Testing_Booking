package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Delete_BookingPage;

import static io.restassured.RestAssured.basePath;

public class Delete_BookingTest extends BaseTest{

    Delete_BookingPage delete_bookingPage = new Delete_BookingPage();

    @BeforeClass
    public void manageBasePath(){
        basePath = "/booking";
    }
    @Test(priority = 7)
    public void deleteBooking() {
        response = delete_bookingPage.requestDeleteBooking(auth, id);
        System.out.println(response.getStatusCode());
    }
}
