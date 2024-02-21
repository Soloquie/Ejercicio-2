package patronfactory;

public class TarjetaDebito implements CrearPago{
 
    @Override

    public void Crearpago(){
        System.out.println("Pago mediante tarjeta de debito exitoso");
    }
}
