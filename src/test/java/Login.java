import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Login_ApiTelkom {

    @Test
    void postLogin(){

        RestAssured.baseURI = "https://api-staging-builder.engineer.ai/users";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject requestParams=new JSONObject();

        requestParams.put("email","staging-engineer-02@yopmail.com");
        requestParams.put("password","Asdf1234");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(requestParams.toString());

        Response response = httpRequest.request(Method.POST,"/sign_in");

        System.out.println("Response Body is: "+response.asString());
        System.out.println("Status Code is :"+response.getStatusCode());
        System.out.println("Body : "+response.getBody().asString());
        System.out.println("Time : "+response.getTime());
        System.out.println("Header : "+response.getHeader("content-type"));
    }
}