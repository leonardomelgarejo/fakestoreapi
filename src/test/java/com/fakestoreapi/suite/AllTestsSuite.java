package com.fakestoreapi.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({
        "com.fakestoreapi.tests.health",
        "com.fakestoreapi.tests.contract",
        "com.fakestoreapi.tests.functional",
        "com.fakestoreapi.tests.e2e"
})
public class AllTestsSuite {
}
