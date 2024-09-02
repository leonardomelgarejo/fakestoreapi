package com.fakestoreapi.tests.health;

import com.fakestoreapi.BaseTest;
import io.qameta.allure.restassured.AllureRestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@DisplayName("Classe de testes de health check dos recursos")
public class HealthCheckTest extends BaseTest {

    @Test
    @DisplayName("Health check do recurso /products")
    public void productsHealthCheck(){
        given()
            .filter(new AllureRestAssured())
        .when()
            .get(configuration.basePathProducts())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }
}
