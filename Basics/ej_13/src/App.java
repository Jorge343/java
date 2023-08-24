import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribi una frase");
        String frase = sc.next();
        char carac;
        String frase_inv = "";
        sc.close();

        for(int z = frase.length()-1; z >= 0; z--){
            carac = frase.charAt(z);
            frase_inv += carac;
        }
        System.out.println("Su frase invertida es:\n" + frase_inv );
    }
}
