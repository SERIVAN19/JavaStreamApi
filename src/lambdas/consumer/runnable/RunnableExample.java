package lambdas.consumer.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /*Runnable
         * No recibe ningun valor y no retorna nada.
         * */
        Runnable runnable = () -> {
            System.out.println("Hello from a thread!");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
