package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplyProcessor implements Processor {
    private int multiplier;

    public MultiplyProcessor(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number * this.multiplier).collect(Collectors.toList());
    }
}
