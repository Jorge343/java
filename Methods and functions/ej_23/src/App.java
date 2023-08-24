import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasame dos numeros y te muestro los pares que hay entre ellos");
        System.out.println("Numero 1: ");
        int n1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int n2 = sc.nextInt();
        System.out.println("El listado de pares es: ");

        NumPares(n1, n2);
    }

    public static void NumPares(int n1, int n2){

        if(n1 > n2){
            int aux = n1;
            n1 = n2;
            aux = n2;
        }
        for(int i = n1+1; i<n2; i++){
            if(i%2 == 0)
                System.out.println(i);
        }

        
    }
}
