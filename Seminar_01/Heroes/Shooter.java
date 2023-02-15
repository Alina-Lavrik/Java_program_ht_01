package Seminar_01.Heroes;

public class Shooter extends BaseHero{
    /**Боеприпасы*/
    private int ammunition;
    private String gun;
    /**Меткая стрельба*/
    private int markmanship;

    public Shooter(String heroID, int health, int endurance, int speed, int life, int level, int money, int ammunition, String gun, int markmanship) {
        super(heroID, health, endurance, speed, life, level, money);

        this.ammunition = ammunition;
        this.gun = gun;
        this.markmanship = markmanship;
    }

    /**Делать выстрел */
    public void GetShoot(int shoot) { // Можно сделать через рандом если меткость 1 то попал если 0, то нет
        if (this.life - shoot > 0) {
            this.life -= shoot;
        }
        // else { die(); }
    }

    protected boolean aiming() {
        if (endurance < 100) {
            return false;
        }
        else return true;
    }
}