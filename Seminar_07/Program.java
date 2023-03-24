package Seminar_07;

import Seminar_04.Heroes.Magician;
import Seminar_04.Heroes.Monk;
import Seminar_04.Heroes.Names;
import Seminar_04.Heroes.Vector2D;
import Seminar_04.Heroes.Raider;
import Seminar_04.Heroes.Sniper;
import Seminar_04.Heroes.Spearman;
import Seminar_04.Heroes.Villager;
import Seminar_04.Heroes.Arbalester;
import Seminar_04.Heroes.BaseHero;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.Random;
import java.util.Scanner;




public class Program {
/**
 * @param args
 */
        
static final int UNITS = 10;

    public static ArrayList<BaseHero> holyTeam = new ArrayList<>();
    public static ArrayList<BaseHero> darkTeam = new ArrayList<>();
    public static ArrayList<BaseHero> allTeam = new ArrayList<>();
    public static void main(String[] args) {
      
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
            
        
        // for (BaseHero hero: allTeam) {
        //     if (holyTeam.contains(hero)) System.out.println("holyTeam");
        //     else System.out.println("darkTeam");
        // }
        
        /**Свой - чужой */
        while (true){
            View.view();
            user_input.nextLine();
            for (BaseHero hero: allTeam) {
                if (holyTeam.contains(hero)) hero.step(holyTeam, darkTeam);
                else hero.step(holyTeam, darkTeam);
            }
        }

        // System.out.println(">>>>> Holy team <<<<<\n");
        // printTeam(holyTeam);
        
        // System.out.println(">>>>> Dark team <<<<<\n");
        // printTeam(darkTeam);
        
        
        }
        
        static void printTeam(ArrayList<BaseHero> team) {
            team.forEach(n -> System.out.println(n.getInfo()));
            System.out.println("\n****************************\n");
        }

        static void createTeam (ArrayList<BaseHero> team, int offset, int posY) {
            for (int i = 0; i < UNITS; i++) {
                int rnd = new Random().nextInt(4)+offset;
                switch (rnd) {
                    case (0):
                        team.add(new Villager(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (1):
                        team.add(new Raider(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (2):
                        team.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (3):
                        team.add(new Magician(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (4):
                        team.add(new Arbalester(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (5):
                        team.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                        break;
                    case (6):
                        team.add(new Spearman(getName(), new Vector2D(i + 1, posY)));
                        break;
                }
            }
        }
        
        
    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHealth() - o1.getHealth());
                else return (int) (o2.getSpeed() - o1.getSpeed());
            }
    });
        System.out.println(">>>>> All team <<<<<\n");
            printTeam(team);
    }  
        
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }      
}
