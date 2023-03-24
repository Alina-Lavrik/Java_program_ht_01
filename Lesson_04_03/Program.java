package Lesson_04_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(10, 61, 33, 44, 55, 99));
        
        Integer t = Methods.getElementFromUCollection(data, 4);
        System.out.println(t);
        // var el = Methods.getElementFromIntegerCollection(data, 1);
        // System.out.println(el);
        // el = Methods.<Integer>getElementFromUCollection(data, 2);
        // el = Methods.getElementFromUCollection(data, 2);
        // System.out.println(el);

        List<String> text = new ArrayList<>(Arrays.asList("Good", "evening", "!!!"));
        String tx = Methods.getElementFromUCollection(text, 0);
        System.out.println(tx);

    }

}
