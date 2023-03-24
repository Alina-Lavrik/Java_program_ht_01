package Lesson_02_3;
import java.util.ArrayList;
import java.util.List;

import Lesson_02_3.Healers.*;
import Lesson_02_3.Warriors.*;


public class Program7 {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);
        /**Привести конкретного игрока к типу войнов */
        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);  // если воин проводим атаку
        }
        else if (h instanceof Healer) {
            ((Healer) h).healing(null);  // если лекарь - лечим
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>(); // наполняем коллекцию войнами
        //team2.add(new Druid());
        team2.add(new Paladin());   // можем наполнять теми у кого базовый тит Warrior
        team2.add(new Knigh());

        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();  // наполняем коллекцию лекарями
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);


        //#endregion
    }
}