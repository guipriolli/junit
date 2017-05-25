package com.schoolofnet.junit_maven;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static com.schoolofnet.junit_maven.isEmptyString.*;
import static com.schoolofnet.junit_maven.DisivibleBy.*;

import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssert() {
        //String
        String str1 = "jUnit";
        String str2 = "jUnit";
        assertEquals(str1, str2);

        //Integer
        Integer int1 = 1;
        Integer int2 = 1;
        assertSame(int1, int2);

        //Arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        assertArrayEquals(array1, array2);

        //Exemplos assertThat
        assertThat(str1, is("jUnit"));
        assertThat(str1, isA(String.class));
        assertThat("Not equals", "1234", is("1234"));

        String tst = "";
        assertThat(tst, is(isEmpty(tst)));

        Integer tst2 = 4;
        assertThat(tst2, is(disivibleBy(2)));
    }
}
