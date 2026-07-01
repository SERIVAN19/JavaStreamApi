package lambdas.consumer.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*BinaryOperator
         * Recibe dos valores del mismo tipo y retorna un valor del mismo tipo.
         * */
        BinaryOperator<Integer> sum = (number1, number2) -> number1 + number2;

        System.out.println(sum.apply(5, 3)); // 8
        System.out.println(sum.apply(2, 4)); // 6
    }
}
