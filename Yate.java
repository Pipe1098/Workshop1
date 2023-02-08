import java.util.Scanner;

public class Yate extends Embarcacion {

    private int cantidadCamarotes;

    public Yate(Capitan capi, int precioBase, int valorAdicional, int fechaFabricacion, Double slora,
            int cantidadCamarotes) {
        super(capi, precioBase, valorAdicional, fechaFabricacion, slora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int CalcularMontoAlquiler() {
        // TODO Auto-generated method stub
        return super.CalcularMontoAlquiler();
    }

    @Override
    public String Tamano() {
        // TODO Auto-generated method stub
        return "";
    }

    public int Comprar() {

        System.out.println("Desea comprar el yate, si/no?");
        Scanner in = new Scanner(System.in);
        String confirm = in.nextLine();
        int precioVenta = 35000000;

        if (confirm.equalsIgnoreCase("si")) {

            if (cantidadCamarotes > 7) {
                precioVenta = precioVenta + 23500000;
                return precioVenta;
            } else {
                return precioVenta;
            }
        } else {
            System.out.println("Ok, hasta luego");
            return 0;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", CantidadCamarotes=" + cantidadCamarotes +
                '}';
    }

}
