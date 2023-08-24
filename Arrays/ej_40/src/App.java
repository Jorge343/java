import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        final int DIVISOR = 23;
        char letrasxd [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 
                            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
        
        System.out.println("Pasame tu numero de DNI?(no se a que se refiere creo)");
        
        int dni = sc.nextInt();
        sc.close();
        int indice = dni % DIVISOR;

        System.out.println(dni + " " + letrasxd [indice]);

    }


}
