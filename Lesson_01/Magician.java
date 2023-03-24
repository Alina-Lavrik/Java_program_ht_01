package Lesson_01;
//import java.util.Random;

/**BaseHero родительский класс, Magician дочерний класс */
public class Magician extends BaseHero { // класс Magician будет явл. наследником класса BaseHero

    private int mana;  // заклинания
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);  // возвращает информацию из метода super.getInfo и добавляет ману
    }
}
    
// // Механизм конструктора
//     public Magician() {

//     // super.name = "!!!"; при обращении к членам базового класса лучше писать super
//     // ходить между кодом - выделить name и нажать f12
        
//     super(String.format("Hero_Magician #%d", ++Magician.number),
//         Magician.r.nextInt(100, 200));
//     this.maxMana = Magician.r.nextInt(50, 150);
//     this.mana = maxMana;
// }

// // Механизм атаки
//     public int Attack() {
//         int damage = Magician.r.nextInt(20, 30);
//         this.mana -= (int)(damage * 0.8);
//         if (mana < 0) return 0;
//         else return damage;
//     }
// // Метод получения информации
//     public String getInfo() {
//         return String.format("%s  Mana: %d", super.getInfo(), this.mana);
//     }

// }
