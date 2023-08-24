import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");

        System.out.println("Mandame una oración");
        String oracion = sc.next();
        sc.close();

        char[] caracteres = new char[oracion.length()];

        char carac;

        for (int i = 0; i < caracteres.length; i++) {
            carac = oracion.charAt(i);
            caracteres[i] = carac;
        }
        MostrarArray(caracteres);
    }
    public static void MostrarArray(char [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
