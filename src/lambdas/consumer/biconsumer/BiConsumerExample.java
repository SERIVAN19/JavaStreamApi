package lambdas.consumer.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*BiConsumer
        *Recibe dos valoresy no retorna nada
        * */
        BiConsumer<String, String> printBiConsumer = (parametro1, parametro2) ->
                System.out.println(parametro1 + " " + parametro2);

        printBiConsumer.accept("Sergio", "Bueno");
    }
}
