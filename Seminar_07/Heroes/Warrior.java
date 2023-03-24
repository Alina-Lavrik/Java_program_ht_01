package Seminar_07.Heroes;

import java.util.ArrayList;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
        int attack, int protection, int posX, int posY, int delivery) {
        super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, posX, posY);
     
    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die"))
            return;
        BaseHero victim = team2.get(findNearest(team2));
        if (victim.coords.getDistance(coords) < 2) {
            float damage = (victim.protection - attack) > 0 ? minDamage
                    : (victim.protection - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(damage);
        } else {
            Vector2D tempvc = coords.chooseWay(victim.coords);
            if (Math.abs(tempvc.posX) < Math.abs(tempvc.posY)) {
                if (coords.chooseWay(victim.coords).posY > 0) {
                    coords.posY--;
                } else {
                    coords.posY++;
                }
            } else {
                if (coords.chooseWay(victim.coords).posX > 0) {
                    coords.posX--;
                } else {
                    coords.posX++;
                }
            }
        }
        return;
    }

}
