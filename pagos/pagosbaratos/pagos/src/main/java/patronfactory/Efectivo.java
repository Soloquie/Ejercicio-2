package patronfactory;

public class Efectivo implements CrearPago {
    @Override

    public void Crearpago(){
        System.out.println("Pago mediante efectivo exitoso");
    }
}

