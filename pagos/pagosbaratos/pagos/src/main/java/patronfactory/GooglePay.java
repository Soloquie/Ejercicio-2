package patronfactory;

public class GooglePay implements CrearPago {
    @Override

    public void Crearpago(){
        System.out.println("Pago mediante google pay exitoso");
    }
}