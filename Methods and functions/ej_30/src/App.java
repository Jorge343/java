import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte la longitud de su contraseña");
        int longitud = sc.nextInt();
        sc.close();

        System.out.println(GenerarPassword(longitud));
    }
    public static int NumAleatorio(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static char MayusAleatoria(){
        return (char) (NumAleatorio(65, 90));
    }
    
    public static char MinusAleatoria(){
    return (char) (NumAleatorio(97, 122));
    }

    public static String GenerarPassword (int longitud){
        String password = "";
        int op;
        for (int i = 0; i < longitud; i++){
            
            NumAleatorio(0, 2);
            op = NumAleatorio(0, 2);
            
            switch(op){
                case 0:
                    password += NumAleatorio(0, 9);
                    break;
                
                case 1:
                    password += MayusAleatoria();
                    break;
                
                case 2:        
                    password += MinusAleatoria();
                    break;
            }
        }
        return password;
    }
}
