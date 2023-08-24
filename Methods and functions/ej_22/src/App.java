import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("10 Numeros aleatorios entre:\n" + "Minimo: ");
        int minimo = sc.nextInt();
        System.out.println("Maximo: ");
        int maximo = sc.nextInt();
        System.out.println("Sus numeros son:");
        for(int i = 0; i<10; i++){
            System.out.println(numAleatorio(minimo, maximo));
        }
    }
    public static int numAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
