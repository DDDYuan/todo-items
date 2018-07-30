package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class OddFilter implements Processor {
    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    }
}
