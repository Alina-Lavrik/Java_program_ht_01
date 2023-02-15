package Seminar_01.Heroes;


public class Villager extends Warrior {
    /**Семена */
    private int seeds;
    /**Урожай */
    private int crop;

    String name;

    public Villager() {
        super("Villager_01", 300, 300, 20, 3, 1, 2000, 3333, "Shovel", 90);
        this.seeds = 500;
        this.crop = 500;
        this.name = "Erofey";

     
    }
/**Поменять урожай на деньги, здоровье, ману*/
public void ChangeCrop(int crop) {}

/**Продать уражай */
public void SellCrop(int crop, int money){}

/**Посадить урожай */
public void PlantCrop(int seeds, int tool){}

/**Собрать урожай */
public void GatherCrop(int crop, int tool){}

}
