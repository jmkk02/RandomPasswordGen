package me.julie.randompasswordgen;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomPasswordGen {
    public static void main(String[] args) { // comment one out to only run one method
        method1();
        method2();
    }

    private static void method1() {
        // "final" = can not be changed. Good practice.
        final Random random = new Random(); // Random is a class. This is a new instance.
        for (int i = 0; i < 10; i++) { // "i" goes from 0 to 9 (10 times)
            final int num = random.nextInt(93) + 34; // 0 - 92 and then adds 34 (ascii table)
            final char character = (char) num; // casting
            System.out.print(character); // not println!
        }
    }

    private static void method2() {
        IntStream.range(0, 10).mapToObj((n) -> (char) (new Random().nextInt(93) + 34)).forEach(System.out::print);
        // Stream = a "list" but doesn't function like a LIST. idk.
        // mapToObj = map means change one value to another. It's not int, double, or long, so it's ToObj.
        // -> = with this parameter (n), do this (char) (new Random ... 34) LIKE a method
        // System.out::print = from System.out, run the method print. This is equal to
        //     forEach((c) -> System.out.print(c))
    }
}
