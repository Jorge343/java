import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num;
        do {
        System.out.println("¡Numero perfecto!\n" + "Ingrese un numero y averigue si es perfecto:");
        num = sc.nextInt();
        sc.close();
            if(!(num>=0))
                System.out.println("El numero debe ser mayor a 0");            
        } while (!(num >= 0));

        int suma = 0;

        for(int i = 0; i<num; i++){
            if (num % i == 0)
                suma += i;
        }
        if(suma == num)
            System.out.println("El numero es perfecto! :D");
        else
            System.out.println("No es perfecto :(");
    }
}
