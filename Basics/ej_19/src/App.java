import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //realizar una ecuacion de segundo grado, para eso necesito 3 valores, a b y c, despues tendria que hacer las operaciones necesarias con esos 3 valores y devolver dos raices

        Scanner sc = new Scanner(System.in);
        double r1, r2;
        System.out.println("Ingrese 3 valores (a, b y c) para su ecuación cuadratica \n" + "Ingrese el valor a");
        int a = sc.nextInt();
        System.out.println("Ingrese el valor b");
        int b = sc.nextInt();
        System.out.println("Ingrese el valor c");
        int c = sc.nextInt();
        sc.close();

        double discriminante = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        
        if(a!=0  &&  discriminante > 0){

            r1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2*a);
            r2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2*a);

            System.out.println("Las raices son: x1= " + r1 + "y x2= " + r2 );
        }

        else if (a != 0 && discriminante == 0){
            r1 = -b / (2*a);
            System.out.println("Tiene una sola solucón y es: x= " + r1);
        }
        else
            System.out.println("No tiene solución, raiz negativa o división por 0");    
    }
}
