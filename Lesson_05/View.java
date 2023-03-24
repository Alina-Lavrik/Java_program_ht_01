package Lesson_05;

import java.util.Scanner;
/**Компонент View позволяет работать с терминалом */
public class View {
    Scanner in = new Scanner(System.in);

    /**Метод, который получает текст, выводит и распечатывает число*/
    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(int data, String title){
        System.out.printf("%s %d\n", title, data);
    }
        
    

}



