package Lesson_03_01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.beans.Beans;

import Lesson_03_01.ExBeverage.*;

public class Program {
    public static void main(String[] args){
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(22);
        // nums.add(333);
        // nums.add(4444);
        // nums.add(55555);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        // Worker worker = new Worker(
        //     "Имя", "Фамилия A", 23, 45000);

        // Iterator<String> components = worker;

        // while (components.hasNext()) {
        //     System.out.println(worker.next());
        // }
        
         //#region Beverage Iterator

        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода1"));
        latte.addComponent(new Water("Вода2"));
        latte.addComponent(new Water("Вода3"));
        
        for(var Ingredient : latte){
            System.err.println(Ingredient);
        }

        /**С помощью итератора пробегаемся по всем нужным напиткам */
        // Iterator<Ingredient> iterator = latte;
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        //#endregion
    }
}

    

