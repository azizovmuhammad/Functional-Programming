package finalsection;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        hello("o'roq",
                null,
                value -> System.out.println("no lastname provided " + value));

        hello2("o'roq",
                null,
                () -> System.out.println("no lastname provided "));
    }

    static void hello(String firsName, String lastName, Consumer<String> callback) {
        System.out.println(firsName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firsName);
        }
    }

        static void hello2(String firsName, String lastName, Runnable callback){
            System.out.println(firsName);

            if (lastName != null){
                System.out.println(lastName);
            }
            else {
                callback.run();
            }
    }
}
