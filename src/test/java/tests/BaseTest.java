package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class BaseTest {
    public static String auth = "Basic YWRtaW46cGFzc3dvcmQxMjM=";

//    public static RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
    Response response = null;
    public static String id;
//    GetBooking1 getBooking =  new GetBooking1();
    @BeforeTest
    public void init() {
        baseURI = "https://restful-booker.herokuapp.com";
//        requestSpecification = given().relaxedHTTPSValidation().baseUri("https://restful-booker.herokuapp.com");
    }
}
