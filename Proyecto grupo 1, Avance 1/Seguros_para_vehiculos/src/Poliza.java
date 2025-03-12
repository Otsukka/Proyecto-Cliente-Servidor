class Poliza {
    private String numeroPoliza;
    private double monto;

    public Poliza(String numeroPoliza, double monto) {
        this.numeroPoliza = numeroPoliza;
        this.monto = monto;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public double getMonto() {
        return monto;
    }

    public void mostrarDetalles() {
        System.out.println("Póliza: " + numeroPoliza + ", Monto: ₡" + monto);
    }
}