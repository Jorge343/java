import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1;
        
        do {
            System.out.println("Escribime un numero");
            n1 = sc.nextInt();
            if(!(n1>=7 && n1<=10))
                System.out.println("El numero debe estar entre 7 y 10");            
        } while (!(n1>=7 && n1<=10));

        System.out.println("Su numero: " + n1 + "\n" + "Esta dentro de los parametros");
        sc.close();
    }
}
