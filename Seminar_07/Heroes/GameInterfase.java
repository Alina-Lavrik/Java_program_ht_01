package Seminar_07.Heroes;

import java.util.ArrayList;

public interface GameInterfase {
    
    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    
    StringBuilder getInfo();
}