package com.fakestoreapi.tests.functional;

import com.fakestoreapi.BaseTest;
import io.qameta.allure.restassured.AllureRestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

@DisplayName("Classe de testes funcionais dos recursos")
public class ProductsTest extends BaseTest {
    @Test
    @DisplayName("Deve listar todos produtos")
    public void deveListarTodosProdutos(){
        given()
            .filter(new AllureRestAssured())
        .when()
            .get("/products")
        .then()
            .statusCode(HttpStatus.SC_OK)
            .body("", hasSize(20))
            .body("title", hasItem("Solid Gold Petite Micropave "))
            .extract().body().asString()
        ;
    }
}
