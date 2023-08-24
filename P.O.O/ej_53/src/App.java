
public class App {
    
    /*
        Crear una clase avion con los siguientes atribuos:
            - Modelo
            - Numero de asientos
            - Velocidad maxima
        Dos Constructores:
            - Constructor vacio
            - Constructor completo
        Metodos o propiedades:
            - Getter y setter
            - toString()
     */
    
    public static class avion{
        
        //Atributos
        
        private String modelo;
        private int nAsientos;
        private double VelMaxima;

            //Constructores
        
            public avion() {

            }

            public avion(String modelo, int nAsientos, double VelMaxima) {

                this.modelo = modelo;
                this.nAsientos = nAsientos;
                this.VelMaxima = VelMaxima;

            }

            // Metodos o propiedades

            public String get_Modelo() {
                return modelo;
            }

            public int get_nAsientos() {
                return nAsientos;
            }

            public double get_VelMaxima() {
                return VelMaxima;
            }

            
            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public void setnAsientos(int nAsientos) {
                this.nAsientos = nAsientos;
            }

            public void setVelMaxima(double velMaxima) {
                VelMaxima = velMaxima;
            }

            public String toString() {
                return "Avion \n Modelo = " + modelo + "\n nAsientos = " + nAsientos + "\n VelMaxima = " + VelMaxima
                        + "]";
            }
        }

    public static void main(String[] args) throws Exception {

        avion avion1 = new avion();
        
        avion avion2 = new avion("Massachusets 254", 300, 450);

        System.out.println(avion1.get_Modelo());
        avion1.setModelo("miau");
        avion1.setnAsientos(125);

        System.out.println(avion1.get_Modelo());
        System.out.println(avion2.toString());
    
    }
}
