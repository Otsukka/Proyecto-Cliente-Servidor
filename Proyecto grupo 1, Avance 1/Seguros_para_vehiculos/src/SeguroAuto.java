class SeguroAuto extends Seguro {
    private Vehiculo vehiculo;

    public SeguroAuto(String numeroPoliza, double precioBase, Vehiculo vehiculo) {
        super(numeroPoliza, precioBase);
        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCosto() {
        //De ejemplo para mejorar en el siguiete avance
        return precioBase * 1.2;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Seguro de Auto - Poliza: " + numeroPoliza +
                ", Placa: " + vehiculo.getPlaca() +
                ", Marca: " + vehiculo.getMarca() +
                ", Modelo: " + vehiculo.getModelo());
    }
}
