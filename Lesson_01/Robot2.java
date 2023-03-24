package Lesson_01;

public class Robot2 {
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * 
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */

    public Robot2(String name, int level){
        this.name = name;
        this.level = level;
    }

     // Методы вкл\выкл подсистем
        
     public void powerOn(){   // кнопка включения системы, которая по порядку вызывает BIOS, OS, Hi
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff(){  // кнопка выключения
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }   // метод, который позволяет считать уровень

   //  public getName() {
   //      return this.name;
   //  }      // метод, который позволяет считать имя

 /**Загрузка BIOS */
    private void startBIOS() { System.out.println("Start BIOS..."); }

 /**Загрузка OS */
    private void startOS() { System.out.println("Start OS...");   }

 /**Приветствие */
    private void sayHi() { System.out.println("Hello world..."); }

 /**Выгрузка BIOS */
    private void stopBIOS() { System.out.println("Stop BIOS..."); }
 
 /**Выгрузка OS */
    private void stopOS() { System.out.println("Stop OS..."); }

 /**Прощание */
    private void sayBye() { System.out.println("Bye..."); }

 /**Работа */
    public void work() { System.out.println("Working..."); }
}


