package com.example.exceptions;

import org.junit.Test;

import com.example.exceptions.NoClassDefFoundErrorExample;

public class NoClassDefFoundErrorUnitTest {

    @Test(expected = NoClassDefFoundError.class)
    public void givenInitErrorInClass_whenloadClass_thenNoClassDefFoundError() {
        NoClassDefFoundErrorExample sample = new NoClassDefFoundErrorExample();
        sample.getClassWithInitErrors();
    }
}