package lambdas.consumer;


import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        /*Consumer
        * recibe un valor y no retorna nada.
        * */
        Consumer<String> printConsumer = (parametro) ->
                System.out.println(parametro);

        printConsumer.accept("Sergio");
    }
}