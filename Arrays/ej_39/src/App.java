public class App {
    public static void main(String[] args) throws Exception {

        int nums[] = new int[GenerarAleatorio(3, 10)];
        RellenarArray(0, 10, nums);
        System.out.println("Su array es: ");
        MostrarArray(nums);
        Num_Repetido(nums);

    }

    public static void MostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int GenerarAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }

    public static void RellenarArray(int minimo, int maximo, int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = GenerarAleatorio(minimo, maximo);
        }
    }
    public static void Num_Repetido(int array []){
        int cant_repe = 0;
        int repe = 0;
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            cont = 0;
            for (int j = 0; j < array.length; j++){
                if(array[j] == array[i])
                    cont ++;
                if(cont >= cant_repe){
                    cant_repe = cont;
                    repe = array [i];
                }
                   
            }
        }
        if (cant_repe > 1)
            System.out.println("El numero más repetido es " + repe + " y se repite " + cant_repe + " veces");
        else
            System.out.println("No hay numero que se repita");
    }
}