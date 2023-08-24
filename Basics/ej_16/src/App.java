import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int maximo = 101;
        int random = (int) (Math.random()*maximo);
        int num1;
        //String valido = "Si";
        //String negativo = "No";
        boolean fin = false;
        //String res_usuario;
        System.out.println("¡Adivina el numero entre 1 y 100!" );
        while(!fin){    
            do{
                System.out.println("Dame un numero entero entre 1 y 100" );
                num1 = sc.nextInt();
                if (num1 < 0 || num1 > maximo )
                    System.out.println("¡Tenes que escribir un numero entre 1 y 100! No te hagas el vivo");
                }
                while(num1 < 0 || num1 > maximo);
    
                    if ( num1 < random)
                        System.out.println("El numero es más grande");
                    else if ( num1 > random)
                        System.out.println("Más chico!");
                    else{
                        System.out.println("¡Bien! Le pegaste");
                        fin = true;

                        /*do{
                            System.out.println("Si       |       No");
                            res_usuario = sc.next();
                            if((res_usuario.equals(valido)==false) || (res_usuario.equals(negativo)==false))
                                System.out.println("Introduzca una respuesta valida");
                        }
                        while(!(res_usuario.equals(valido)) || !(res_usuario.equals(negativo)));
                        
                            if(res_usuario.equals(valido))
                                System.out.println("¡Bien!");
                            else{
                                System.out.println("Ok.");
                                fin = true;
                                }*/
                        /*for(int i=1; i>0; i++ ){
                            res_usuario = sc.next().toLowerCase().trim();
                            if ((res_usuario.charAt(0)!='s') || (res_usuario.charAt(0)!='n'))
                                System.out.println("No flaco, Si o No");
                            else
                                i=-1;
                        }
                        System.out.println("Seguis jugando?");
                        res_usuario = sc.next().toLowerCase().trim();
                        if(res_usuario.charAt(0)=='s')
                                System.out.println("¡Bien!");
                        else{
                            System.out.println("Ok.");
                            fin = true;
                            }*/
                }       
            }
        sc.close();
    }
}
