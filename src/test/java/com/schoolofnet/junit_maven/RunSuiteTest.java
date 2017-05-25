package com.schoolofnet.junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AnnonTest.class,
    AssertTest.class,
    StringUtils.class
})
public class RunSuiteTest {

}
