package Lesson_03;

public class Program {
    public static void main(String[] args) {
        /**Создаем экземпляр foo1 класса Foo */
        Foo foo2 = new Foo() {

            @Override
            public void m1() {
                System.out.println(">>>>Экземпляр m1");              
            }
            @Override
            public void m2() {
                System.out.println("Экземпляр m2");

            }    
        };
        foo2.m1();
        
    }
}