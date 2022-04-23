import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostManTestV1 {

    @Test
    void shouldReturn() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset = UTF-8")
                .body("TakeMeПривет1")

                .when()
                .post("/post")


                .then()

                .statusCode(200)
                .assertThat().body("data", equalTo("TakeMeПривет1"))

        ;
    }


}
