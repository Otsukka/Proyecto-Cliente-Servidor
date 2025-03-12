abstract class Seguro {
    protected String numeroPoliza;
    protected double precioBase;

    public Seguro(String numeroPoliza, double precioBase) {
        this.numeroPoliza = numeroPoliza;
        this.precioBase = precioBase;
    }

    // Métodos abstractos
    public abstract double calcularCosto();
    public abstract void mostrarDetalles();
}