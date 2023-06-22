import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("---¡Bienvenido a la calculadora de IVA!---");
        Thread.sleep(1000);
        System.out.println("¿Cual es el precio de su producto?");
        
        final double IVA = 21;
        //final establece que a partir de esta linea, el valor de la variable no puede ser modificada, es util para el uso de constantes.
        double precio = sc.nextDouble();
        double precioIVA = precio + ((precio / 100)*IVA);

        System.out.println("Su producto con el impuesto aplicado vale: $" + precioIVA);
        sc.close();
    }
}
