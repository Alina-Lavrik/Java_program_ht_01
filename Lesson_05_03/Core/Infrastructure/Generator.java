package Lesson_05_03.Core.Infrastructure;


import java.util.Random;

public class Generator {
    static Random r = new Random();

    public static int number() {
        return r.nextInt(10, 15);
    }
}
