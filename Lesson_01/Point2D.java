package Lesson_01;

/**
 * Это точка 2D
 */
public class Point2D  {
    private int x, y;                 // private - закрыли как на чтение так и на запись

// сниппед ctor, чтобы создать конструктор
/**
 * 
 * @param valueX это координата X
 * @param valueY это координата Y
 */
    public Point2D(int valueX, int valueY) {           // конструктор с 2-мя аргументами
        x = valueX;
        y = valueY;
    }
    
    public Point2D(int value) {
        //this.x = value;                      // this обращается к опредленному элементу классачерез точку
        this(value, value);
    }

    public Point2D() {
        this(0);
    }


    public int getX(){    // метод возвращающий координаты x
        return x;
    }

    public int getY(){   // метод возвращающий координаты y
        return y;
    }

    public void setX(int value){   // метод изменения координаты x
        this.x = value;
    }

    public void setY(int value){   // метод изменения координаты y
        this.y = value;
    }

    public String getInfo() {             // к методу public любой может получить доступ, к private нет
        return String.format("x: %d; y: %d", x, y);   // технически данный метод здесь не нужен
    }

    @Override                            //  переопределение метода                    
    public String toString() {           //  метод toString будет возвращать метод getInfo
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

