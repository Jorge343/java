import java.util.Locale;
import java.util.Scanner;

public class App {
    //enumerado de puestos para no tener que hacer una condicion por cada puesto
    public enum Trabajo {
        Vendedor, 
        Director, 
        Conserje;
        }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        System.out.println("Escribi tu salario");
        double salario = sc.nextDouble();
        
        System.out.println("Escribi tu puesto");
        String puesto = sc.next().toUpperCase().trim();
        
        boolean existe = false; //variable para comprobar la existencia del puesto, de esto va a depender las condiciones
        //Con esto compruebo si el trabajo ingresado por el usuario coincide con alguno de los puestos del listado
        for (Trabajo t:Trabajo.values()){
            if(puesto.equals(t.name()))
                existe = true;
        }
        if(existe){
            double salarioFinal = salario;
            Trabajo p = Trabajo.valueOf(puesto);

            switch(p){
                case Vendedor:
                    salarioFinal += 500;
                break;

                case Director:
                    salarioFinal += 1000;
                break;

                case Conserje:
                    salarioFinal += 100;
                break;
            }
        }

    }
}

