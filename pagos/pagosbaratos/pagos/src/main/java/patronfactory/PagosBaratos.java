package patronfactory;

public class PagosBaratos {

    public CrearPago ObtenerPago (TipoPago tiposDePago) throws NoSuchFieldException{
        return switch (tiposDePago){
            case APPLE -> new ApplePay();
            case EFECTIVO-> new Efectivo();
            case BITCOIN -> new Bitcoin();
            case CREDITO-> new TarjetaCredito();
            case PAYPAL -> new Paypal();
            case DEBITO -> new TarjetaDebito();
            case GOOGLE -> new GooglePay();
            case TRANSFERENCIA-> new Transferencia();
           

            default -> throw new NoSuchFieldException("Tipo de pago no disponible para este servicio");
        };
        

    }
    
}
