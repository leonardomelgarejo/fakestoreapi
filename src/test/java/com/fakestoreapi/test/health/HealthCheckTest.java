package com.fakestoreapi.test.health;

import com.fakestoreapi.config.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    public void healthCheck(){
        given()
        .when()
            .get("/products")
        .then()
            .statusCode(200)
        ;
    }
}
