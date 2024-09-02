package com.fakestoreapi.tests.functional;

import com.fakestoreapi.BaseTest;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@DisplayName("Classe de testes funcionais dos recursos")
public class ProductsTest extends BaseTest {
    private static final Logger log = LogManager.getLogger(ProductsTest.class);
    @Test
    @DisplayName("Deve listar todos produtos")
    public void deveListarTodosProdutos(){
        String responseString = given()
            .log().all()
        .when()
            .get("/products")
        .then()
            .log().all()
            .statusCode(HttpStatus.SC_OK)
            .body("", hasSize(20))
            .body("title", hasItem("Solid Gold Petite Micropave "))
            .extract().body().asString()
        ;

        log.info(responseString);
    }
}
