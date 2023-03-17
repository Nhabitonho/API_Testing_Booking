package Demo;

import org.testng.annotations.Test;


public class TestForRest {



//    Response response = null;
//    @BeforeTest
//    public void init(){
//        RestAssured.baseURI = "https://reqres.in/api";
//    }
////    @Test
////    public void firstTestCase() {
//////        baseURI = "https://restful-booker.herokuapp.com";
////
////        Response res = given().relaxedHTTPSValidation().when().get("https://reqres.in/api/users?page=2");
////        res.prettyPrint();
////        res.then().statusCode(200);
//////        Response res;
//////        res = get("https://reqres.in/api/users?page=2");
////
////        System.out.println(res.getStatusCode());
////        System.out.println(res.getTime());
////        System.out.println(res.getBody().asString());
////        System.out.println(res.getStatusLine());
////        System.out.println(res.getHeader("Content-Type"));
////    }
//
//    //Get methods
//    @Test
//    public void getExample() {
////        RestAssured.baseURI = "https://reqres.in/api";
//        response = RestAssured.given().relaxedHTTPSValidation().when().get("/users/2");
////        RestAssured.baseURI = "https://petstore.swagger.io/v2";
////        response = RestAssured.given().when().get("/pet/12");
//        System.out.println("Response :" + response.asString());
//        Assert.assertEquals(200, response.getStatusCode());
//        Assert.assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data.email"));
//        assertTrue(response.jsonPath().getString("data.first_name").contains("Janet"));
//    }
//
//    //Get methods with query parameters
//    @Test
//
//    public void getQueryPara(){
//        RestAssured.baseURI = "https://reqres.in/api";
//        response = RestAssured.given().relaxedHTTPSValidation().when().queryParam("page", 2).get("/users");
//        System.out.println("Response :" + response.asString());
//        response.prettyPrint();
//        Assert.assertEquals(200, response.getStatusCode());
//        Assert.assertEquals("Lindsay", response.jsonPath().getString("data[1].first_name"));
//
//    }
//
//    //Get methods with path parameters
//    @Test
//    public void getPathPara(){
//        String id = "3";
////        baseURI = "https://reqres.in/api";
//        RestAssured.basePath = "/users";
//        response = RestAssured.given().relaxedHTTPSValidation().when().pathParam("id", id).get("/{id}");
//        response.prettyPrint();
//        System.out.println("Status code: " + response.getStatusCode());
//        System.out.println(response.jsonPath().getString("data.first_name"));
//    }
//
//    //Post Methods
//    @Test
//    public void postExample(){
//        RestAssured.baseURI = "https://reqres.in/api";
//        String requestBody = "{\n"
//                +"   \"name\": \"Long\", \n"
//                +"   \"job\": \"Intern\"\n"
//                +"}";
//        response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(requestBody).post("/users");
//
//        response.prettyPrint();
//        Assert.assertEquals(201, response.getStatusCode());
//    }
//    //Put Request
//    @Test
//    public void putExample(){
//        RestAssured.baseURI = "https://reqres.in/api";
//        String requestBody = "{\n"
//                +"   \"name\": \"Long\", \n"
//                +"   \"job\": \"SE\"\n"
//                +"}";
//        response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(requestBody).put("/users/2");
////        response.prettyPrint();
//        System.out.println("Response: "+ response.asString());
//        System.out.println(response.getStatusCode());
//    }
//    //Patch Request
//    @Test
//    public void patchExample(){
//        RestAssured.baseURI = "https://reqres.in/api";
//        String requestBody = "{\n"
//                +"   \"name\": \"Long01\""
//                +"}";
//        response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(requestBody).patch("/users/2");
//        System.out.println("Response: "+ response.asString());
//        System.out.println(response.getStatusCode());
//    }
//    //Delete methods
//    @Test
//    public void deleteExample(){
//        RestAssured.baseURI = "https://reqres.in/api";
//        response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).delete("/users/2");
//        System.out.println(response.getStatusCode());
//    }
//    //Add headers
//    @Test
//    public void addHeader(){
//        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
//        int id = 1;
//        String requestBody = "{\n"
//                +"   \"username\": \"admin\", \n"
//                +"   \"password\": \"password123\"\n"
//                +"}";
//        String auth = "Basic YWRtaW46cGFzc3dvcmQxMjM=";
//        response = RestAssured.given()
//                .relaxedHTTPSValidation()
//                .header("Content-Type", "application/json")
//                .when()
//                .body(requestBody)
//                .post("/auth");
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }
//    // send request with query params
//    @Test
//    public void getQueryParam(){
//        RestAssured.basePath = "/users";
//        response = RestAssured.given()
//                .relaxedHTTPSValidation()
//                .queryParam("page", "2")
//                .get();
//        response.prettyPrint();
//        System.out.println(response.getStatusCode());
//    }


}


