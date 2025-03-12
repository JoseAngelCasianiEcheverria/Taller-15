/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_de_Mantenimiento;

/**
 *
 * @author Gercray
 */
public class MantenimientoGeneral implements Reparacion, Limpiar {
    @Override
    public void reparar() {
        System.out.println("El equipo de mantenimiento esta realizando una reparacion");
    }
    
    @Override
    public void limpiar() {
        System.out.println("El equipo de mantenimiento esta limpiando.");
    }
}
