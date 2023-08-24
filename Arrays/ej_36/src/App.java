import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int ValidarNum(int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);

        if (minimo > maximo) {
            int aux = maximo;
            maximo = minimo;
            minimo = aux;
        }
        int num;
        do {
            System.out.println("Dame un numero entero entre " + minimo + " y " + maximo);
            num = sc.nextInt();
            if (num < minimo || num > maximo)
                System.out.println(
                        "¡Tenes que escribir un numero entre " + minimo + " y " + maximo + "! No te hagas el vivo");
        } while (num < minimo || num > maximo);
        return num;
    }

    
}
