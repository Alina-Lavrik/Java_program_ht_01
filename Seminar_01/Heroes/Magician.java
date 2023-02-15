package Seminar_01.Heroes;

/**Колдун*/
public class Magician extends Priest {

String name;

    public Magician(){
        super("Magician_01", 300, 300, 100, 5, 1, 500, 2000, 2000);
        this.name = "Harry";


    }
    // public String getInfo() {
    //     return String.format(" %s Mana: %d Elixir: %d Name: %s", super.getInfo(), this.name);  
    // }
}
