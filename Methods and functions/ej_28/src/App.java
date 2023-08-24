import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Tirame una palabrita o una frase");
        String frase = sc.next();
        System.out.println("Contiene " + CuentaMayusMinus(frase, true) + " mayusculas y " + CuentaMayusMinus(frase, false) + " minusculas");

    }
    
    public static int CuentaMayusMinus(String frase, boolean mayus){
        
        int min, max, cont=0;

        if(mayus == true){
            min = 65;
            max = 90;
        }
        else{
            min = 97;
            max = 122;
        }
        char carac;
        for(int i = 0; i< frase.length(); i++){
            carac = frase.charAt(i);
            if (carac >= min && carac <= max)
                cont++;
        }
        return cont;


    }
}
