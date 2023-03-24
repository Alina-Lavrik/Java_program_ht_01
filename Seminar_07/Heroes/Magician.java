package Seminar_07.Heroes;

/**Колдун*/
public class Magician extends Priest {

    public Magician(String name, Vector2D coords){
        super("Magician", name, 30.f, 30, 9, 0, -5, 17, 
        12, coords.posX, coords.posY, 5, 5); 
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| Health:\t").append(Magician.super.health)
                .append(" \t| MP:\t").append(Magician.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.coords.posX)
                .append(".").append(Magician.super.coords.posY);
    }

}
