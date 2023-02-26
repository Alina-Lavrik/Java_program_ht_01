package Seminar_04;

import Seminar_04.Heroes.Magician;
import Seminar_04.Heroes.Monk;
import Seminar_04.Heroes.Names;
import Seminar_04.Heroes.Point;
import Seminar_04.Heroes.Raider;
import Seminar_04.Heroes.Sniper;
import Seminar_04.Heroes.Spearman;
import Seminar_04.Heroes.Villager;
import Seminar_04.Heroes.Arbalester;
import Seminar_04.Heroes.BaseHero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        /**Создать список - команда красных */
        List<BaseHero> red = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            switch (new Random().nextInt(0, 4)){
                case 0:
                red.add(new Villager(Villager.getName(), 1, i + 1));
                break;
                case 1:
                red.add(new Raider(Raider.getName(), 1, i + 1));
                break;
                case 2:
                red.add(new Sniper(Sniper.getName() , 1, i + 1));
                break;
                case 3:
                red.add(new Magician(Magician.getName() , 1, i + 1));
                break;
            }
             System.out.println(red.get(i).getInfo());
        }
        /**Создать список - команда зеленых */
        List<BaseHero> green = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            switch (new Random().nextInt(0, 3)){
                case 0:
                green.add(new Monk(Monk.getName() , 10, i + 1));
                break;
                case 1:
                green.add(new Arbalester(Arbalester.getName(), 10, i + 1));
                break;
                case 2:
                green.add(new Spearman(Spearman.getName(), 10, i + 1));
                break;
              
            }
           System.out.println(green.get(i).getInfo());
         }
        System.out.println();
        
      

        red.sort(new Comparator<BaseHero>() {

        @Override
        public int compare(BaseHero o1, BaseHero o2) {
            return Integer.compare(o1.speed, o2.speed);
    }
});
        System.out.println(">>>>> Red team <<<<<");
        red.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));
        System.out.println("\n****************************\n");
        

        green.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return Integer.compare(o1.speed, o2.speed);
        }
    });
            System.out.println(">>>>> Green team <<<<<");
            green.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));
            System.out.println("\n****************************\n");

        /**Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */
        List<BaseHero> mainQueue = new ArrayList<>();

        mainQueue.addAll(red);
        mainQueue.addAll(green);

        mainQueue.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2){
                        if (o2.getSpeed() == o1.getSpeed()) 
                        return o2.getHealth() - o1.getHealth();
                        else {
                        return o2.getSpeed() - o1.getSpeed();
                        }
            }

        });
        System.out.println(">>>>> Queue green & red <<<<<");
        mainQueue.forEach(n -> System.out.println(n.getInfo() + n.getQueue()));

        }
    }