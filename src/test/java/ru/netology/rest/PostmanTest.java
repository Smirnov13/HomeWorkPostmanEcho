package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanTest {
    @Test
    void shouldReturnSendData() {
        String text = "Good job";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));

    }
}
