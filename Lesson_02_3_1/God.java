package Lesson_02_3_1;

import Lesson_02_3_1.Healers.*;
import Lesson_02_3_1.Warriors.*;

/**Класс который будет героем и одновременно как лекарем так и войном */
public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}
