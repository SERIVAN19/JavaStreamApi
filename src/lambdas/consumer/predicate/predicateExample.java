package lambdas.consumer.predicate;

public class predicateExample {
    public static void main(String[] args) {

        /*Predicate
         * Recibe un valor y retorna un booleano.
         * */
        java.util.function.Predicate<Integer> isEven = (number) -> number % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}
