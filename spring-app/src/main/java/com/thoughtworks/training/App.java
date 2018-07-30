package com.thoughtworks.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new App().runWithSpring();
    }

    public void run() {
        NumberProcessor numberProcessor = new NumberProcessor(Arrays.asList(new EvenFilter(), new PlusProcessor(2)));
        System.out.println(numberProcessor.process(new Scanner(System.in).nextLine()));
    }

    public void runWithSpring() {
        BeanFactory factory = new ClassPathXmlApplicationContext("content.xml");
        NumberProcessor numberProcessor = factory.getBean(NumberProcessor.class);
        System.out.println(numberProcessor.process(new Scanner(System.in).nextLine()));
    }
}
