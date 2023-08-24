public class App {
    public static void main(String[] args) throws Exception {
        
        String nombres [] = {"Fernando", "Alejandro", "Martin", "Jaime"};
        int    edad    [] = {15, 25, 64, 13};
        int mayor = 0;
        int nombreDelMayor = 0;

        for (int i = 0; i < edad.length; i++) {
            
            if(edad[i] > mayor){
                mayor = edad[i];
                nombreDelMayor = i;
            }
        }

        System.out.println("La persona mas grande es "+ nombres[nombreDelMayor] + " con " + mayor + " años");


    } 
}
