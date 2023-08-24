public class App {
    public static void main(String[] args) throws Exception {
        
        int nums [] = {0, 1, 2, 3, 5};
        System.out.println("El numero mas grande de su lista es " + Mayor_del_array(nums));
        System.out.println("Y el más chico es " + Menor_del_array(nums));
    }
    
    public static int Mayor_del_array(int array []){
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > mayor)
                mayor = array[i];
        }
        return mayor;
    }
    public static int Menor_del_array(int array []){
        int menor = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < menor)
                menor = array[i];
        }
        return menor;
    }
}
