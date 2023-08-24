public class App {
    public static void main(String[] args) throws Exception {

        int nums [] = new int[Integer.MAX_VALUE];

        RellenarArray(0, 10, nums);
        MostrarArray(nums);
    }
    public static int GenerarAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    public static void RellenarArray(int minimo, int maximo, int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = GenerarAleatorio(minimo, maximo); 
        }
    }
    public static void MostrarArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
