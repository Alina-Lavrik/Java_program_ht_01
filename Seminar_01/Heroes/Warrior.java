package Seminar_01.Heroes;

public class Warrior extends BaseHero {
    private int power;
    //*Оружие */
    private String weapon;
    private int hit;


public Warrior(String heroID, int health, int endurance, int speed, int life, int level, int money, int power, String weapon, int hit) {
    super(heroID, health, endurance, speed, life, level, money);
    this.power = power;
    this.weapon = weapon;
    this.hit = hit;
}

/**Наносить удар */
public void GetStrike(int strike) { // Можно сделать через рандом количество ударов
    if (this.endurance - strike > 0) {
        this.endurance -= strike;
    } 
    // else { die(); }
}

/**Грабить */
public void GetRob(int rob) {
    if (this.money - rob > 0) {
        this.money -= rob;
    }
    // else { no money(); }
}



}