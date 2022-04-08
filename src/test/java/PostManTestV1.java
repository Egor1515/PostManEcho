import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PostManTestV1 {

    @Test
    void shouldReturn() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset = UTF-8")
                .body("TakeMeПривет")


                .when()
                .post("/post")

                .then()

                .statusCode(200)
                .assertThat().body("data", equalTo("TakeMeПривет"))

        ;
    }


}
