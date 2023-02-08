public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capi, int precioBase, int valorAdicional, int fechaFabricacion, Double slora,
            int cantidadMastiles) {
        super(capi, precioBase, valorAdicional, fechaFabricacion, slora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public int CalcularMontoAlquiler() {
        // TODO Auto-generated method stub
        return super.CalcularMontoAlquiler();
    }

    @Override
    public int Comprar() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String Tamano() {
        if (cantidadMastiles > 4) {
            return "Grande";

        } else {
            return "Pequeno";

        }

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", CantidadMastiles=" + cantidadMastiles +
                '}';
    }

}