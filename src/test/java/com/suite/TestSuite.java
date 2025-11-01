package com.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class})
@SelectPackages({"com.suite","com.annotations"})
public class TestSuite {
}
