package Lesson_04_02;


import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Worker w = new Worker(28, "firstName", "lastName", 20, 22);

        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());
        System.out.println(w1.fullName());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());

        // #endregion

        // #region MultiParameterized
        MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
                111, 2.0, "SOS");
        System.out.println(mp1);
        System.out.println(mp1.getSpisok());
        

        MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
                "How", "are", "you");
        System.out.println(mp2);
        System.out.println(mp2.getSpisok());

        // #endregion

    }
}
