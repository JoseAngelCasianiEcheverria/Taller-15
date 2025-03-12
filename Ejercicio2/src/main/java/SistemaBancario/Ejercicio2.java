/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SistemaBancario;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Transferencia servicioTransferencia = new ServicioTransferencia();
        Retiro cajero = new CajeroAutomatico();
        PagoFactura servicioPago = new ServicioPago();
        Banco banco = new Banco();
        
        servicioTransferencia.transferir();
        cajero.retirar();
        servicioPago.pagarFactura();
        banco.transferir();
        banco.retirar();
        banco.pagarFactura();
    }
}
