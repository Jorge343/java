import java.util.Calendar;

public class App {

    
    
    public static class Aeropuerto {

        private String nombre;
        private String pais;
        private String calle;
        private int numero;
        private String ciudad;
        private int año_inauguracion;
        private int capacidad;

        
        public Aeropuerto() {

        }


        public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int año_inauguracion, int capacidad) {
            this.nombre = nombre;
            this.pais = pais;
            this.calle = calle;
            this.numero = numero;
            this.ciudad = ciudad;
            this.año_inauguracion = año_inauguracion;
            this.capacidad = capacidad;
        }


        public String getNombre() {
            return nombre;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
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
            return "Aeropuerto [nombre=" + nombre + ", pais=" + pais + ", calle=" + calle + ", numero=" + numero
                    + ", ciudad=" + ciudad + ", año_inauguracion=" + año_inauguracion + ", capacidad=" + capacidad
                    + "]";
        }
    }

    public static void main (String [] args) throws Exception {
        
        Aeropuerto aero1 = new Aeropuerto("Jorge Newberry", "Argentina", "Manuel Garcia", 2052, "C.A.B.A", 1980, 300000);

        System.out.println(aero1.toString());
        
        System.out.println("El aeropuerto se encuentra abierto hace " + aero1.añosAbierto() + " años");


    }
}
