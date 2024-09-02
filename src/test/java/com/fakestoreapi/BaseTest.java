package com.fakestoreapi;

import com.fakestoreapi.config.Configuration;
import com.fakestoreapi.config.ConfigurationManager;
import com.fakestoreapi.specs.InitialStateReqSpec;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest{

    protected static Configuration configuration;

    @BeforeAll
    public static void setup(){
        configuration = ConfigurationManager.getConfiguration();

        RestAssured.baseURI = configuration.baseURI();
        RestAssured.port = configuration.port();

        RestAssured.requestSpecification = InitialStateReqSpec.set();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
