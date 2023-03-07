package Seminar_04.Heroes;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
        int attack, int protection, int posX, int posY, int delivery) {
        super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, posX, posY);
     
    }
   

}
