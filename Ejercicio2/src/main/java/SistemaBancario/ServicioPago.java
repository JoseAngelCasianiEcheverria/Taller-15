/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Gercray
 */
public class ServicioPago implements PagoFactura {
    @Override
    public void pagarFactura() {
        System.out.println("Pagando una factura desde el sistema");
    }
    
}
