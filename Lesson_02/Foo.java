package Lesson_02;
/**класс Do расширяет класс Foo */
class Doo extends Foo{

    public void M(){
        Foo.count = 5555;
    }
}

public class Foo {
    public Integer value;

    protected static Integer count;

    public static Integer getCount(){
        return count;                  // при static слово this писать не нужно, можно обращаться через имя типа
    }

    static{
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override                         // начать набирать toString
    public String toString() {
        return value.toString();
    }
}
