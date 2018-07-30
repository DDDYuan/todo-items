package com.thoughtworks.training;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        NumberProcessor numberProcessor = new NumberProcessor(Arrays.asList(new EvenFilter(), new PlusProcessor(2)));
        System.out.println(numberProcessor.process(new Scanner(System.in).nextLine()));
    }
}
