package javaMealB;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import requestBuilder.TokenRequestBuilder;
import utils.ReusableMethods;

import javax.xml.transform.sax.SAXSource;

public class Token {

    @Test
    public  void getToken_1(){
        String token = ReusableMethods.getToken("AfganShah","Afgan-0601");

}}
