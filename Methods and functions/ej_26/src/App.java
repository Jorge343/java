import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Mandame una frase o palabra");
        String frase = sc.next().trim();
        sc.close();
        
        System.out.println(InvertirFrase(frase));
        
        if(Palindromo(frase) == true)
            System.out.println("Es palindromo");
        else
            System.out.println("No es palindromo");
    }
    public static String InvertirFrase(String frase){

        String frase_inv = "";
        char a;
        
        for (int z = frase.length()-1; z >= 0; z--){
            a = frase.charAt(z);
            frase_inv += a;
        }
        return frase_inv;
    }
    public static boolean Palindromo(String frase){
        if (frase.equals(InvertirFrase(frase)))
            return true;
        else
            return false;
    }
}
