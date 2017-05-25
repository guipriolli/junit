package com.schoolofnet.junit_maven;

import org.junit.Test;
import static org.junit.Assert.*;

public class SuiteCaseTest1 {

    @Test
    public void calc() {
        assertEquals(4, 2 + 2);
    }
}
