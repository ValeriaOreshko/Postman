package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void shouldReturnData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("hello")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("hi"))
        ;
    }

}
