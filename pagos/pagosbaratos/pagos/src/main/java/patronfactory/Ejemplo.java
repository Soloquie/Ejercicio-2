package patronfactory;

public class Ejemplo {
    public static void main(String[] args) throws NoSuchFieldException {
        //ejemploConIF(TipoDePago.BITCOIN);
        procesarPago(TipoPago.PAYPAL);
        procesarPago(TipoPago.CREDITO);
        procesarPago(TipoPago.BITCOIN);
        procesarPago(TipoPago.APPLE);
    }

    public static void ejemploConIF(TipoPago tiposDePago) {
        if (tiposDePago == TipoPago.PAYPAL) {
            crearPagoPayPal();
        } else if(tiposDePago == TipoPago.CREDITO){
            System.out.println("Pago con credito exitoso ");
        } else if(tiposDePago == TipoPago.DEBITO){
            System.out.println("Pago con debito exitoso ");
        } else if(tiposDePago == TipoPago.TRANSFERENCIA){
            System.out.println("Pago con transferencia exitoso ");
        } else if(tiposDePago == TipoPago.BITCOIN){
            System.out.println("Pago con bitcoin exitoso ");
        } else if(tiposDePago == TipoPago.EFECTIVO){
            System.out.println("Pago con efectivo exitoso ");
        } else if(tiposDePago == TipoPago.APPLE){
            System.out.println("Pago con apple exitoso ");
        } else if(tiposDePago == TipoPago.GOOGLE){
            System.out.println("Pago con google exitoso ");
        } else {
            System.out.println("No se pudo realizar el pago ");
        }
    }

    public static void crearPagoPayPal() {
    }

    public static void procesarPago(TipoPago tipoDePago) throws NoSuchFieldException {
        PagosBaratos pagosBaratos = new PagosBaratos();
        CrearPago pago = pagosBaratos.ObtenerPago(tipoDePago);
        pago.Crearpago();
    }
}
