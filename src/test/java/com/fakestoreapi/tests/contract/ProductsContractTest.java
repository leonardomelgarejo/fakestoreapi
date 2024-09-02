package com.fakestoreapi.tests.contract;

import com.fakestoreapi.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@DisplayName("Classe de testes de contratos dos recursos")
public class ProductsContractTest extends BaseTest {
    @Test
    @DisplayName("Deve validar schema do recurso /products")
    public void deveValidarProductsSchemaJson(){
        given()
        .when()
            .get("/products")
        .then()
            .log().all()
            .statusCode(HttpStatus.SC_OK)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/products.json"))
        ;
    }
}
