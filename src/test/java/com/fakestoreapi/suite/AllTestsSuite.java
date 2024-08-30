package com.fakestoreapi.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({
        "com.fakestoreapi.test.health",
        "com.fakestoreapi.test.contract",
        "com.fakestoreapi.test.functional",
        "com.fakestoreapi.test.e2e"
})
public class AllTestsSuite {
}
