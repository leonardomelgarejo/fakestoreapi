package com.fakestoreapi.test.functional;

import com.fakestoreapi.config.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductTest extends BaseTest {

    @Test
    public void deveListarTodosProdutos(){
        given()
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
