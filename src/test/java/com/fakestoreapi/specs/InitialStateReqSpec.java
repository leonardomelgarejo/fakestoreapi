package com.fakestoreapi.specs;

import com.fakestoreapi.config.ConfigurationManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class InitialStateReqSpec {

    private InitialStateReqSpec(){
    }

    public static RequestSpecification set(){
        var configuration = ConfigurationManager.getConfiguration();

        return new RequestSpecBuilder()
                .setBaseUri(configuration.baseURI())
                .setPort(configuration.port())
                .setContentType(configuration.contentType())
                .build();
    }
}
