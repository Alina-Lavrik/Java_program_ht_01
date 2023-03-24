package Seminar_07.Heroes;

/**Копейщик */
public class Spearman extends Warrior {

    public Spearman(String name, Vector2D coords){
       super("Spearman", name, 20.f, 10, 4, 3, 1, 
       4, 5, coords.posX, coords.posY, 0); 
   }

   

   @Override
   public StringBuilder getInfo() {
       StringBuilder builder = new StringBuilder();
       return builder.append("Копейщик:\t").append(Spearman.super.name)
               .append("\t| ATK:\t").append(Spearman.super.attack)
               .append("\t| Health:\t").append(Spearman.super.health)
               .append(" \t|\t\t\t|").append("\t| (X.Y) : ")
               .append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
   }
}
