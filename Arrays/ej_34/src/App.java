import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Crear dos arrays e indicar si son iguales

        //lo puedo hacer recorriendo los dos arrays con una especie de puntero, e ir indicando si el array1  en la pos 0 es igual al array2, pero me da paja y lo hago con un metodo
        
        System.out.println("Hello, World!");

        int array1 [] = {1, 2, 3};
        int array2 [] = {1, 2, 3};

        if (Arrays.equals(array1, array2)) System.out.println("Los arrays son iguales");
        
        else System.out.println("No son iguales");
    }
}
