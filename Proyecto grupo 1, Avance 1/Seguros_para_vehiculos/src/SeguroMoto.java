class SeguroMoto extends Seguro {
    private Vehiculo vehiculo;

    public SeguroMoto(String numeroPoliza, double precioBase, Vehiculo vehiculo) {
        super(numeroPoliza, precioBase);
        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCosto() {
        //De ejemplo para mejorar en el siguiete avance
        return precioBase * 1.1;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Seguro de Moto - Poliza: " + numeroPoliza +
                ", Placa: " + vehiculo.getPlaca() +
                ", Marca: " + vehiculo.getMarca() +
                ", Modelo: " + vehiculo.getModelo());
    }
}