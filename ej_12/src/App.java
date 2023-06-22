import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Escribime una cantidad de segundos");
        
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int seg_rest = (segundos % 3600);
        int minutos = seg_rest / 60;
        segundos = (seg_rest % 60);
        
        System.out.println( horas + " hora/s " + minutos + " minuto/s " + segundos +  " y segundo/s");    
        sc.close();
    }
}
