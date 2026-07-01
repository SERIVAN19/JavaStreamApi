package lambdas.consumer.bifuntion;

public class BiFuntionExample {
    public static void main(String[] args) {
        /*BiFunction
         * Recibe dos valores y retorna un valor.
         * */
        java.util.function.BiFunction<String, String, String> printBiFunction = (parametro1, parametro2) ->
                parametro1 + " " + parametro2;

        System.out.println(printBiFunction.apply("Sergio", "Bueno"));
    }
}
