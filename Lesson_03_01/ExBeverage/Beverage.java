package Lesson_03_01.ExBeverage;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {

    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    // public void addComponent(Ingredient component){
    //     components.add(component);
    // }


     public void addComponent(Ingredient component)   {

        if(!(components.indexOf(component) != -1))
        components.add(component);
     }
// Добавить способ, чтобы нельзы бфло все время добавлять только воду

/**Реализация методов итератора */
    // @Override
    // public boolean hasNext() {
    //     return index < components.size();
    // }
    
    // @Override
    // public Ingredient next() {
    //     return components.get(index++);
    // }
}
