public abstract class Embarcacion {

    protected Capitan capi;
    protected int precioBase;
    protected int ValorAdicional;
    protected int fechaFabricacion;
    protected Double slora;

    public Embarcacion(Capitan capi, int precioBase, int valorAdicional, int fechaFabricacion, Double slora) {
        this.capi = capi;
        this.precioBase = precioBase;
        this.ValorAdicional = valorAdicional;
        this.fechaFabricacion = fechaFabricacion;
        this.slora = slora;
    }

    public abstract String Tamano();

    public abstract int Comprar();

    public int CalcularMontoAlquiler() {
        int valorT;
        if (fechaFabricacion > 2020) {
            valorT = this.precioBase + this.ValorAdicional;
        } else {
            valorT = this.precioBase;
        }
        return valorT;
    }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "capi=" + capi.nombre +
                ", precioBase=" + precioBase +
                ", ValorAdicional=" + ValorAdicional +
                ", fechaFabricacion=" + fechaFabricacion +
                ", slora=" + slora;
    }
}
