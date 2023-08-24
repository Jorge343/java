public class App {
    public static void main(String[] args) throws Exception {
        
        int a [] = {1, 2, 3};
        int b [] = {4, 5, 6};

        Mostrar_Array(Fusion_De_Array(a, b));
    }
    
    public static int [] Fusion_De_Array(int [] array, int [] array2){
        int array_fus [] = new int[array.length + array2.length];

        for(int i = 0; i < array.length; i++){
            array_fus [i] = array [i];
        }
        for (int i = array.length, j=0; i < array_fus.length; i++, j++) {
            array_fus [i] = array2[j];
        }
        return array_fus;
    }
    
    public static void Mostrar_Array(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
