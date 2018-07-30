package com.thoughtworks.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        NumberProcessor numberProcessor = getNumberProcessorBySpring();
        System.out.println(numberProcessor.process(new Scanner(System.in).nextLine()));
    }

    private NumberProcessor getNumberProcessorManully() {
        return new NumberProcessor(Arrays.asList(new EvenFilter(), new PlusProcessor(2)));
    }

    private NumberProcessor getNumberProcessorBySpring() {
        return new ClassPathXmlApplicationContext("content.xml").getBean(NumberProcessor.class);
    }
}
