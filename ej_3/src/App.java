import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String stP = "...";
        String [] strarr = new String [] {"Oka banca dos segundos", "Procesando...", "Para eh, no te apures", "Listo! Aca tenes tus resultados:"};
        int a;
        int b;
        
        System.out.println("Mandame dos numeritos por aca loquito\n" + "Uno aca:");
        a = sc.nextInt();
        System.out.println("Y otro aca:");
        b= sc.nextInt();

        for (int i=0; i<strarr.length; i++ ){
            System.out.println(strarr[i]);
            Thread.sleep(3000);
        }


    
    
    }

}
