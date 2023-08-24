import java.util.Calendar;

public class App {
    
    public static class Direccion{

        private String pais;
        private String calle;
        private int numero;
        private String ciudad;

        public Direccion(){

        }

        public Direccion(String pais, String calle, int numero, String ciudad) {
            this.pais = pais;
            this.calle = calle;
            this.numero = numero;
            this.ciudad = ciudad;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }


        public String toString() {
            return pais + ", " + calle + " al " + numero + " en " + ciudad;
        }

    }

    
    public static class Aeropuerto {

        private String nombre;
        private Direccion direccion;
        private int año_inauguracion;
        private int capacidad;

        
        public Aeropuerto() {

        }


        public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int año_inauguracion, int capacidad) {
            this.nombre = nombre;
            this.direccion = new Direccion(pais, calle, numero, ciudad);
            this.año_inauguracion = año_inauguracion;
            this.capacidad = capacidad;
        }


        public Aeropuerto(String nombre, Direccion direccion, int año_inauguracion, int capacidad) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.año_inauguracion = año_inauguracion;
            this.capacidad = capacidad;
        }


        public String getNombre() {
            return nombre;
        }

        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        
        public Direccion getDireccion(){
            return direccion;
        }

        
        public void setDireccion(Direccion direccion){
            this.direccion = direccion;
        }

        
        public int getAño_inauguracion() {
            return año_inauguracion;
        }


        public void setAño_inauguracion(int año_inauguracion) {
            this.año_inauguracion = año_inauguracion;
        }


        public int getCapacidad() {
            return capacidad;
        }


        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public int añosAbierto(){

            int añoActual = Calendar.getInstance().get(Calendar.YEAR);

            return añoActual - año_inauguracion;
        }


        public String toString() {
            return "El aeropuerto de " + nombre + " con direccion en " + direccion + ", inaugurado en "
                    + año_inauguracion + " tiene una capacidad de " + capacidad + " personas";
        }
    }
    
    
    
    
    public static void main(String[] args) throws Exception {
        Aeropuerto aero1 = new Aeropuerto("Jorge Newberry", "Argentina", "Manuel Garcia", 2052, "C.A.B.A", 1980, 300000);
        Direccion direc1 = new Direccion("Argentina", "Calle siempre viva", 333, "Mauricio");
        Aeropuerto aero2 = new Aeropuerto("Hola", direc1, 2020, 600000);
        
        
        System.out.println(aero1.toString());
        System.out.println("El aeropuerto se encuentra abierto hace " + aero1.añosAbierto() + " años");
        System.out.println(aero2.toString() + "\n Se encuentra abierto hace " + aero2.añosAbierto() + " años");
    }
}
