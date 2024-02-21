package patronfactory;
public class Paypal implements CrearPago{
    @Override

    public void Crearpago(){
        System.out.println("Pago mediante paypal exitoso");
    }
}