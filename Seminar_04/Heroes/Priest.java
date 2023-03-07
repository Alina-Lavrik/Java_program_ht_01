package Seminar_04.Heroes;

import java.util.ArrayList;

public class Priest extends BaseHero {
    int mana;
     
    protected int maxMana;

public Priest(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
    int attack, int protection, int posX, int posY, int mana, int maxMana) {
    super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, posX, posY);
    this.mana = mana;
    this.maxMana = maxMana;
}

@Override
public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    for (BaseHero hero: team1) {
        if (hero.health < hero.maxHealth & !hero.state.equals("Die")) {
            hero.getDamage(maxDamage);
            return;
        }
    }
}

}
