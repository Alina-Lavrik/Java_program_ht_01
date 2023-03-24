package Lesson_02_2;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();                         // Для Dwarf базовым классом является Druid и через super обращаемся к Druid
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}