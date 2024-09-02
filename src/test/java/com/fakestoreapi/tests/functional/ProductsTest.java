package com.fakestoreapi.tests.functional;

import com.fakestoreapi.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductsTest extends BaseTest {

    @Test
    public void deveListarTodosProdutos(){
        given()
            .log().all()
        .when()
            .get("/products")
        .then()
            .log().all()
            .statusCode(200)
            .body("", hasSize(20))
            .body("title", hasItem("Solid Gold Petite Micropave "))
        ;
    }
}
