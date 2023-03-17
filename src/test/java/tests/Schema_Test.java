package tests;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Create_TokenPage;

import java.io.File;
import java.io.InputStream;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class Schema_Test extends BaseTest{
//    Create_TokenPage create_tokenPage = new Create_TokenPage();

    @BeforeClass
    public void manageBasePath() {
//        basePath = "/auth";
    }

    @Test(priority = 1)
    public void schemaTest() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("firstname", "Jim");
        requestbody.put("lastname", "Brown");
        requestbody.put("totalprice", "111");
        requestbody.put("depositpaid", "true");

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout", "2019-01-01");
        requestbody.put("bookingdates", bookingDates);
        requestbody.put("additionalneeds", "Breakfast");

        JSONArray jsonArrayPayload = new JSONArray();
        jsonArrayPayload.add(requestbody);
//        response = create_tokenPage.requestCreateToken(requestBody);

        InputStream createBookingJsonSchema = getClass().getClassLoader()
                        .getResourceAsStream("src/test/resources/createbookingjsonschema.json");

        response = given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestbody)
                        .when()
                .post("/booking")
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/createbookingjsonschema.json")))
                .extract().response();
//        System.out.println(response.getStatusCode());
//        response.prettyPrint();
    }
}
