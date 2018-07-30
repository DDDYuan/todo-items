package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class PlusProcessor implements Processor {
    private int append;

    public PlusProcessor(int append) {
        this.append = append;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number + this.append).collect(Collectors.toList());
    }
}
