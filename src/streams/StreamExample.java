package streams;

import static java.util.Arrays.stream;

public class StreamExample {
    public static void main(String[] args) {


        // Crear un arreglo de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        // Usar Stream para filtrar y mapear los números
        int suma = stream(numeros)
                .filter(n -> n % 2 == 0) // Filtrar números pares
                .map(n -> n * n) // Elevar al cuadrado
                .sum(); // Sumar los resultados
        System.out.println("La suma de los cuadrados de los números pares es: " + suma);



        // Arreglo con nombres
        String[] nombres = {"Ana", "Luis", "Carlos", "Marta"};
        // Usar Stream para filtrar y mapear los nombres
        String nombresFiltrados = stream(nombres)

                //Operadores de los Streams
                // filter():  Filtra los elementos que cumplen una condicion.
                // map(): Aplica una funcion a cada elemento del stream y devuelve un nuevo stream con los resultados.
                // sorted(): Ordena los elementos del stream.
                // forEach(): Aplica una acción a cada elemento.
                // reduce(): Combina todos los elementos en un solo valor.
                // collect(): Recopila los elementos del stream en una colección.
                // distinct(): Elimina los elementos duplicados del stream.
                // limit(): Limita el numero de elementos procesados.
                // skip(): Omite un numero especifico de elementos.
                // anyMatch(): Verifica si algún elemento cumple una condicion.
                // allMatch(): Verifica si todos los elementos cumplen una condicion.
                // noneMatch(): Verifica si ningun elemento cumple una condición.

                .filter(nombre -> nombre.length() > 3) // Filtrar nombres con más de 3 letras
                .map(String::toUpperCase) // Convertir a mayúsculas
                .reduce("", (a, b) -> a + " " + b); // Concatenar los resultados

        System.out.println("Nombres filtrados y en mayúsculas: " + nombresFiltrados);

    }
}
