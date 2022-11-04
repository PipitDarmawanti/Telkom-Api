import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class View_ApiTelkom {


    @Test
    void viewUser(){

        Response response = RestAssured.get("https://api-staging-builder.engineer.ai/user");

        System.out.println("Response : "+response.asString());
        System.out.println("Status Code :"+response.getStatusCode());
        System.out.println("Body : "+response.getBody().asString());
        System.out.println("Time : "+response.getTime());
        System.out.println("Header : "+response.getHeader("content-type"));
    }
}
