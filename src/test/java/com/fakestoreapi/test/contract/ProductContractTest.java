package com.fakestoreapi.test.contract;

import com.fakestoreapi.config.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ProductContractTest extends BaseTest {
    @Test
    public void deveValidarProductsSchemaJson(){
        given()
        .when()
            .get("/products")
        .then()
            .log().all()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("products.json"))
        ;
    }
}
