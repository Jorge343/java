//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Scanner sc = new Scanner (System.in);
        
        int nel = 0;
        boolean sigue = true;
        int numeros [] = new int[nel];

        System.out.println("Inserte los numeros que quiera agregar a su lista");
        
        while (sigue) {
            
            nel = sc.nextInt();
            numeros += nel;
        }*/
        
        int [] nums = { 11, 189, 47, 56, 26, 1, 0 };
        System.out.println(SumaArray(nums) + " " + PromedioDelArray(nums));
    }
    public static int SumaArray(int array []){
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
             suma += array[i];
        }
        return suma;
    }
    public static double PromedioDelArray(int array []){

        double prom;
        prom = (double)SumaArray(array)/array.length;
        return prom;
    }
}

