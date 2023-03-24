package Lesson_02_3_1;

import java.util.ArrayList;
import java.util.List;

import Lesson_02_3_1.Healers.*;
import Lesson_02_3_1.Warriors.*;

public class Program8 {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        }
        else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());
        team2.add(new God());
        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);
        team3.add(new God());
        ((Warrior)team3.get(2)).attack(team1.get(1));
        System.out.println("Реализуется атака");
        //#endregion



    }
}