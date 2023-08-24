import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mandame un numero");
        int num = sc.nextInt();
        sc.close();

        System.out.println("El digito mas alto de tu numero es " + DigitoMasAlto(num));
    }

    public static int DigitoMasAlto(int num){
        int mayor = 0;
        int ultimodigito;

        while(num>10){
            ultimodigito = num%10;
            if(ultimodigito > mayor){
                mayor = ultimodigito;
                }
            num = num/10;        
        }
        return mayor;
    }

}
