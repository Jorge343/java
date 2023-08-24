import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pasame un numero");
        int num = sc.nextInt();
        sc.close();
        
        System.out.println("Su numero tiene " + Contador(num)+ " digitos");
    }
    public static int Contador(int num){
        int digit = 0;
        
        while(num!=0){
            num = num/10;
            digit++;
        }        
        return digit;
    }
}
