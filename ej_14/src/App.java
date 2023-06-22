import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribime una frase o palabra");
        String frase = sc.next().trim();
        String frase_inv = "";
        char a;
        
        for (int z = frase.length()-1; z >= 0; z--){
            a = frase.charAt(z);
            frase_inv += a;
        }
        if((frase.toLowerCase()).equals(frase_inv.toLowerCase()))
            System.out.println("Esta frase es palindroma \n" + "Frase: " + frase + "\nInvertida: " + frase_inv);
        else
            System.out.println("No es palindroma");
        sc.close();
    }
}
