import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class FlightApiTest {

    public static final String API_URL = "https://flights-api.buraky.workers.dev";

    @Test
    public void check_response_status() {
        when().
                get(API_URL).
        then().
                statusCode(200);
    }

    @Test
    public void check_response_body() {
        when().
                get(API_URL).
        then().
                assertThat().
                body(matchesJsonSchemaInClasspath("flights-schema.json"));
    }

    @Test
    public void check_response_header_test() {
        when().
                get(API_URL).
        then().
                contentType("application/json");
    }
}
