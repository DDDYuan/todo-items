package com.thoughtworks.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {
    private List<Processor> processorList;

    NumberProcessor(List<Processor> processors) {
        this.processorList = processors;
    }

    public String process(String input) {
        List<Integer> values = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for (Processor processor : this.processorList) {
            values = processor.process(values);
        }
        return String.join(" ", values.stream().map(String::valueOf).collect(Collectors.toList()));
    }
}
