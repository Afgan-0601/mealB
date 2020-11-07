package utils;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import requestBuilder.TokenRequestBuilder;

import static io.restassured.RestAssured.given;

public class ReusableMethods {


    public static TokenRequestBuilder createTokenRequest(String UserId, String password){
        TokenRequestBuilder reqBody = new TokenRequestBuilder();
        reqBody.setUsernameOrEmailAddress(UserId);
        reqBody.setPassword(password);
        return reqBody;
    }


        public static String getToken(String userID, String password) {
         //Create request body
            TokenRequestBuilder reqBody = createTokenRequest(userID, password);
            RestAssured.baseURI = "https://34.235.0.4/api/tokenauth/authenticate";

          //Submit post call
            Response res = given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(reqBody).when().post();

           // res.prettyPrint();
            String response = res.asString();

           String token = JsonPath.read(response, "$.result.accessToken");

            System.out.println(token);

            return token;

        }
    }


