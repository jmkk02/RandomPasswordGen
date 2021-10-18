package me.julie.randompasswordgen;

import java.util.Random;

public class RandomPasswordGen {
    public static void main(String[] args) {
        // "final" = can not be changed. Good practice.
        final Random random = new Random(); // Random is a class. This is a new instance.
        for (int i = 0; i < 10; i++) { // "i" goes from 0 to 9 (10 times)
            final int num = random.nextInt(93) + 34; // 0 - 92 and then adds 34 (ascii table)
            final char character = (char) num; // casting
            System.out.print(character); // not println!
        }
    }
}
