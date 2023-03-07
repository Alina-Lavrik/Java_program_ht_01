package Seminar_04.Heroes;

import java.util.Random;
import java.util.ArrayList;


public abstract class BaseHero implements GameInterfase {
    protected String hero, name;
    public float health;
    public int speed;
    protected static Random r;
    protected int maxDamage, minDamage;
    protected int attack, protection;
    protected Vector2D coords;
    protected String state;
    protected int maxHealth;
   

/**Конструктор который отвечает за инициализацию */
public BaseHero(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage,
    int attack, int protection, int posX, int posY) {
    this.hero = hero;
    this.name = name;
    this.health = health;
    this.maxHealth = maxHealth;
    this.speed = speed;
    this.maxDamage = maxDamage;
    this.minDamage = minDamage;
    this.attack = attack;
    this.protection = protection;
    coords = new Vector2D(posX, posY);
    state = "Stand";
    
}
@Override
public String toString() {
    return name +
            " H:" + Math.round(health) +
            " P:" + protection +
            " A:" + attack +
            " Dmg:" + Math.round(Math.abs((minDamage + maxDamage)/2)) +
            " " + state;
}

public int[] getCoords() {return new int[]{coords.posX, coords.posY};}

// public static String getName(){
//     return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
// }

public int getSpeed() {return speed;}

public float getHealth() {
    return health;
}

public String getQueue() {
    return String.format(" >> speed: %d", this.speed);
}

@Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {}

    protected void getDamage(float damage) {
        this.health -= damage;
        if (health <= 0) {
            health = 0;
            state = "Die";
        }
        if (health > maxHealth)
            health = maxHealth;
    }

    protected int findNearest(ArrayList<BaseHero> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
    @Override
    public StringBuilder getInfo() {return new StringBuilder(""); }

}

