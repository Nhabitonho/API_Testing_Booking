package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Create_TokenPage;

import static io.restassured.RestAssured.basePath;

public class Create_TokenTest extends BaseTest {

    Create_TokenPage create_tokenPage = new Create_TokenPage();

    @BeforeClass
    public void manageBasePath() {
        basePath = "/auth";
    }

    @Test(priority = 1)
    public void createToken() {
        String requestBody = "{\n"
                + "   \"username\": \"admin\", \n"
                + "   \"password\": \"password123\"\n"
                + "}";



        response = create_tokenPage.requestCreateToken(requestBody);
        System.out.println(response.getStatusCode());
        response.prettyPrint();
        System.out.println(response.jsonPath().getString("token"));
    }
}
