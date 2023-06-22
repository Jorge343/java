import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        int op;
        boolean fin=false;

        while(!fin){
            System.out.println("Inserte un numero");
            a = sc.nextDouble();
            System.out.println("Inserte un segundo numero");
            b = sc.nextDouble();
            System.out.println("Que opción desea realizar?\n"  + " 1 Suma\n" + " 2 Resta\n " + " 3 Multiplicacion\n " + " 4 Division\n " + " 5 Modulo\n");
            
            try{    
                op = sc.nextInt();
                switch (op){
                    case 1:
                    System.out.println(a + b);
                    break;
            
                    case 2:
                    System.out.println(a-b);
                    break;
            
                    case 3:
                    System.out.println(a*b);
                    break;
            
                    case 4:
                    if(b==0)
                    System.out.println("No se puede dividir por 0 :(");
                    else
                    System.out.println(a/b);
                    break;
            
                    case 5:
                    System.out.println(a%b);
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Debe insertar un numero");
                sc.next();
            }
        }
    sc.close();    
    }
}
