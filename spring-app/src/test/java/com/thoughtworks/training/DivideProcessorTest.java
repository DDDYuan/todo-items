package com.thoughtworks.training;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DivideProcessorTest {
    @Test
    public void shouldDivideList() {
        assertThat(new DivideProcessor(2).process(Arrays.asList(2, 4, 6)),is(Arrays.asList(1, 2, 3)));
    }
}