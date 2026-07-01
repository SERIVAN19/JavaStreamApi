package lambdas.consumer.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator is a functional interface that takes one argument and returns a result of the same type

        UnaryOperator<Integer> square = x -> x * x;

        // Using the UnaryOperator
        int number = 5;
        int result = square.apply(number);

        System.out.println("The square of " + number + " is: " + result);
    }
}
