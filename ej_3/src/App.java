import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String stP = "...";
        String [] strarr = new String [] {"Oka banca dos segundos", "Procesando...", "Para eh, no te apures", "Listo! Aca tenes tus resultados:"};
        double a;
        double b;
        int op;
        
        System.out.println("Mandame dos numeritos por aca loquito\n" + "Uno aca:");
        a = sc.nextDouble();
        System.out.println("Y otro aca:");
        b= sc.nextDouble();

        for (int i=0; i<strarr.length; i++ ){
            System.out.println(strarr[i]);
            Thread.sleep(1000);
            System.out.println(stP);
            Thread.sleep(1000);
            
                
        }
        System.out.println("Que quiere saber de sus numeros?\n"  + "1 Suma" + " 2 Resta " + " 3 Multiplicacion " + " 4 Division " + " 5 Modulo");
        op = sc.nextInt();
        switch (op){
            case 1:
            System.out.println("La suma de los numeros es:" + (a + b));
            break;
            
            case 2:
            System.out.println("La resta de los numeros es:" + (a-b));
            break;
            
            case 3:
            System.out.println("La multiplicacion de los numeros es:" + a*b);
            break;
            
            case 4:
            if(b==0)
            System.out.println("No se puede dividir por 0 :(");
            else
            System.out.println("La division de los numeros entre si es:"+ a/b);
            break;
            
            case 5:
            System.out.println("El modulo de los numeros es:" + (a%b));
            break;
        }
        sc.close();


    
    
    }

}
