import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mandame una oración");
        String frase = sc.next();
        
        char min [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char mayus [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char letra;
        char caracter;
        
        for(int i=0; i< frase.length(); i++){
            letra = frase.charAt(i);
            for(int m=0; m< min.length; m++){
                caracter = min[m];
                if(letra==caracter)
                    System.out.println(letra + " minuscula");
                }
            
            for(int k=0; k< mayus.length; k++){
                caracter = mayus[k];
                if(letra == caracter)    
                    System.out.println(letra + " Mayuscula");
                }

        }   
    }        
}




