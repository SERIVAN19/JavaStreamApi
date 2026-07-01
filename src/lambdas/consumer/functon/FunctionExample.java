package lambdas.consumer.functon;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*Function
         * Recibe un valor y retorna otro valor.
         * */
        Function<String, String> printFunction = (parametro) -> parametro + " desde el Function";

        System.out.println(printFunction.apply("Sergio"));
    }
}
