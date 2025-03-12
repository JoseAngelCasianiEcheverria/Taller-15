/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Sistema_de_Mantenimiento;

/**
 *
 * @author Gercray
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Reparacion tecnico = new Tecnico();
        Limpiar personalLimpieza = new PersonaLimpieza();
        MantenimientoGeneral mantenimiento = new MantenimientoGeneral();
        
        tecnico.reparar();
        personalLimpieza.limpiar();
        mantenimiento.reparar();
        mantenimiento.limpiar();
    }
}
