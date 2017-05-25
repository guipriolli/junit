package com.schoolofnet.junit_maven;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;

public class AnnonTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("@Before Class executed");
    }

    @Before
    public void beforeTest() {
        System.out.println("@Before annon executed");
    }

    @Test
    @Ignore
    public void testOneTest() {
        System.out.println("@Test one");
    }

    @Test
    @Ignore
    public void testTwoTest() {
        System.out.println("@Test two");
    }

    @Test(expected = Exception.class)
    @Ignore
    public void divideIntegerByZero() {
        int number = 10 / 0;
    }

    @Test
    public void createFolderRuleTest() {
        File folder = null;
        try {
            folder = this.folder.newFolder("MY_FOLDER");
            assertTrue(!folder.exists());
        } catch (IOException e) {
            assertFalse(folder.exists());
        }
    }

    @After
    public void afterTest() {
        System.out.println("@After annon executed");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("@After Class executed");
    }
}
