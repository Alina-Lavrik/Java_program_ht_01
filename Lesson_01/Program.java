package Lesson_01;

public class Program {
    // static double distance(int x1, int y1, int x2, int y2) {
    //     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // }


    public static void main(String[] args) {                      // клиентский код
        Point2D a = new Point2D(0, 2);                // а - экземпляр класса
        a.setX(12);                                   // запись нового значения через метод setX
        a.setY(8);
        System.out.println(a.getX());                     // чтение значения a
        System.out.println(a.getY());
        Point2D b = new Point2D(0);               // b - экземпляр класса

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}

