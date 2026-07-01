package lambdas.consumer.bipredicate;

import java.util.function.BiPredicate;

public class biPredicateExample {
    public static void main(String[] args) {
        /*BiPredicate
         * Recibe dos valores y retorna un booleano.
         * */
        BiPredicate<Integer, Integer> isGreater = (number1, number2) -> number1 > number2;

        System.out.println(isGreater.test(5, 3)); // true
        System.out.println(isGreater.test(2, 4)); // false
    }
}
