package Lesson_02;


public class Program2 {

    void A(){
        System.out.println("A()");
    }
    public static void main(String[] args) {

        // A();   // со static

        Program2 prog = new Program2(); // без static
        prog.A();
        // /**экземпляр класса */
        // Foo f1 = new Foo();       
        // f1.value = 123;
        // // System.out.println(f1.value);
        // f1.printCount();

        // //Foo.count = 123000;

        // Foo f2 = new Foo();
        // f2.value = 777;
        // // System.out.println(f2.value);
        // f2.printCount();

        // Foo f3 = new Foo();
        // f3.value = 987;
        // // System.out.println(f3.value);
        // f3.printCount();
    }
}
