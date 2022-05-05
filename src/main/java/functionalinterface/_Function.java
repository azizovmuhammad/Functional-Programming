package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function takes 1 arguments and produces 1 result

        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(5);
        System.out.println(increment2);

        Integer multiply = multipleBy10Function.apply(5);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1ThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        Integer result = addBy1ThenMultiplyBy10.apply(5);
        System.out.println(result);
        
        // BiFunction takes 2 arguments and produces 1 result
        System.out.println(
                incrementByOneAndMultiply(4, 5));
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(5, 6)
        );
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }
    
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numToMultiplyBy) -> (numberToIncrementByOne + 1) * numToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
