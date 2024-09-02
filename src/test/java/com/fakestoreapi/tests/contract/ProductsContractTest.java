package com.fakestoreapi.tests.contract;

import com.fakestoreapi.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ProductsContractTest extends BaseTest {
    @Test
    public void deveValidarProductsSchemaJson(){
        given()
        .when()
            .get("/products")
        .then()
            .log().all()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/products.json"))
        ;
    }
}
