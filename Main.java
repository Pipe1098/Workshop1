public class Main {

    public static void main(String[] args) {

        // Creamos dos capitanes
        Capitan capi1 = new Capitan("Juan", "Perez", 123);
        Capitan capi2 = new Capitan("Andres", "Molina", 456);

        // Creamos dos Embarcaciones, una de tipo Velero y otra tipo Yate
        Embarcacion uno = new Velero(capi1, 10000000, 5000000, 2020, 20.5, 4);
        Embarcacion dos = new Yate(capi2, 20000000, 8000000, 2023, 10.2, 7);

        System.out.println("Datos de la embarcación uno (Velero): \n" + uno.toString());
        System.out.println("El valor del alquiler para esta embarcación es: $" + uno.CalcularMontoAlquiler());
        System.out.println("El tamaño de la embarcación es: " + uno.Tamano());

        System.out.println("\n/********************************************************************/\n");

        System.out.println("Datos de la embarcación dos (Yate): \n" + dos.toString());
        System.out.println("El valor del alquiler para esta embarcación es: $" + dos.CalcularMontoAlquiler());
        if (dos.Comprar() != 0) {
            System.out.println("El precio para esta embarcación es: $" + dos.Comprar());
        }

    }

}
