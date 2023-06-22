import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Tabla de multiplicar--- \n" + "Ingrese un numero:");
        int n1 = sc.nextInt();
        System.out.println("¿Cual es el máximo por el que quiere multiplicar su tabla?");
        int numTabla = sc.nextInt();
        for(int i=0; i<=numTabla; i++){
        System.out.println(n1 + " x " + i + "=" + (n1*i));
        }
        sc.close();
    }
}
