package lambdas.consumer.supler;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        /*Supplier
        * No recibe ningun valor y retorna un valor.
        * */
        Supplier<String> printSupplier = () -> "Sergiodesde el Suplier";

        System.out.println(printSupplier.get());
    }
}
