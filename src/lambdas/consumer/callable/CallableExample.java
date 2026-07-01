package lambdas.consumer.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*Callable
         * No recibe ningun valor y retorna un valor y puede lanzar una excepcion
         * */
        Callable<String> callable = () -> {
            return "Hello from a callable!";
        };

        try {
            String result = callable.call();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}