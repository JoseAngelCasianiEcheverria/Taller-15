
package SistemaBancario;

public class Banco implements Transferencia, Retiro, PagoFactura {
    @Override
    public void transferir() {
        System.out.println("El banco esta procesando una transferencia");
    }
    
    @Override
    public void retirar() {
        System.out.println("El banco esta procesando un retiro");
    }
    
    @Override
    public void pagarFactura() {
        System.out.println("El banco esta procesando el pago de una factura");
    }
    
}
