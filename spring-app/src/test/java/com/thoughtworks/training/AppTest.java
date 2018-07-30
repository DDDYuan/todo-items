package com.thoughtworks.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintlnCorrectList() {
        System.setIn(new ByteArrayInputStream("1 2 3 4 5".getBytes()));
        new App().run();
        assertThat(outContent.toString(), is("3 5 7\n"));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }
}