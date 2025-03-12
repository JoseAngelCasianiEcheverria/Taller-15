
package Gestion_de_Vehiculos;


public class Ejercicio3 {

    public static void main(String[] args) {
        Conduccion coche = new Coche();
        TransporteMercancia camion = new Camion();
        
        coche.conducir();
        camion.cargarMercancia();
    }
}
