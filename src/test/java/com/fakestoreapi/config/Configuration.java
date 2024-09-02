package com.fakestoreapi.config;

import io.restassured.http.ContentType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:api.properties"
})
public interface Configuration extends Config{

    @Key("api.base.uri")
    String baseURI();

    @Key("api.port")
    int port();

    @Key("content.type")
    ContentType contentType();

    @Key("base.path.products")
    String basePathProducts();

}
