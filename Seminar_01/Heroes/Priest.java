package Seminar_01.Heroes;

public class Priest extends BaseHero {
    protected int mana;
    protected int elixir; 


public Priest(String heroID, int health, int endurance, int speed, int life, int level, int money,int mana, int elixir) {
    super(heroID, health, endurance, speed, life, level, money);
    this.elixir = elixir;
    this.mana = mana;
}

public void ChangeMana(int mana, int crop){

}
public void ChangeElixir(int elixir, int crop){
    
}
/**Исцелить */
public void GetHeal(int mana, int life){

}
/**Вылечить */
public void GetTreatment(int elixir, int health){

}     

public int getMana() {
    return mana;
}
public void setMana(int mana) {
    this.mana = mana;
}
public int getElixir() {
    return elixir;
}
public void setElixir(int elixir) {
    this.elixir = elixir;
}

}
