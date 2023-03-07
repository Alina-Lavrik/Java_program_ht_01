package Seminar_04.Heroes;

public class Raider extends Warrior {
    int disguise;

    // public Raider(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
    // int attack, int protection, int posX, int posY, int disguise, int delivery)  {
    //     super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, posX, posY, delivery);
    //     this.disguise = disguise;
    // }


    public Raider(String name, Vector2D coords){
        super("Raider", name, 25.f, 10, 6, 4, 2, 
        8, 3, coords.posX, coords.posY, 0);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Raider.super.name)
                .append("\t| ATK:\t").append(Raider.super.attack)
                .append("\t| Health:\t").append(Raider.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Raider.super.coords.posX)
                .append(".").append(Raider.super.coords.posY);
}
}