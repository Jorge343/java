import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pasame un numero");
        int num = sc.nextInt();
        sc.close();
        
        int res = sumaN(num);
        System.out.println("La suma de sus numeros previos es: " + res);
    }
    public static int sumaN(int num){
        int suma = 0;
        
        for(int i = 1; i <= num; i++){
            suma += i;
        }
        return suma;
    }
}
