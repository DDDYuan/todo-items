package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class DivideProcessor implements Processor {
    private int divisor;

    public DivideProcessor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number / this.divisor).collect(Collectors.toList());
    }
}
