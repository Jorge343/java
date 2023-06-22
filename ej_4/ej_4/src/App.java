import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mandame el primer numero potro");
        int n1= sc.nextInt(); 
        System.out.println("Mandame el segundo");
        int n2 = sc.nextInt();

        if(n1 <= n2)
            if(n1==n2)
                System.out.println("Son iguales");
                else
                System.out.println("El segundo es mayor al primero");
        else
            System.out.println("El primero es mayor al segundo");
            //else if(n1 == n2)
          //  System.out.println("Los numeros son iguales");
            //else
            //System.out.println("El primero es mayor que el segundo");
        sc.close();
    }
}
