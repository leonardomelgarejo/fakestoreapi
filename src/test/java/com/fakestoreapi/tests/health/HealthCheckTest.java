package com.fakestoreapi.tests.health;

import com.fakestoreapi.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    public void productsHealthCheck(){
        given()
        .when()
            .get("/products")
        .then()
            .statusCode(200)
        ;
    }
}
