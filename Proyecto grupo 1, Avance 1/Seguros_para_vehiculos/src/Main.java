public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo auto = new Vehiculo("DYR777", "Ferrari", "LaFerrari");
        Vehiculo moto = new Vehiculo("002-366", "Yamaha", "YZR-M1 MotoGP");

        // Crear seguros
        SeguroAuto seguroAuto = new SeguroAuto("12345", 10000, auto);
        SeguroMoto seguroMoto = new SeguroMoto("67890", 5000, moto);

        // Crear cliente y agregar seguros
        Cliente cliente = new Cliente("Lewis Hamilton", "4-0157-0234");
        cliente.agregarSeguro(seguroAuto);
        cliente.agregarSeguro(seguroMoto);

        // Crear pólizas
        Poliza polizaAuto = new Poliza("POL555", seguroAuto.calcularCosto());
        Poliza polizaMoto = new Poliza("POL444", seguroMoto.calcularCosto());

        // Crear aseguradora y agregar cliente y pólizas
        Aseguradora aseguradora = new Aseguradora("Seguros S.A");
        aseguradora.agregarCliente(cliente);
        aseguradora.agregarPoliza(polizaAuto);
        aseguradora.agregarPoliza(polizaMoto);

        // Mostrar detalles de la aseguradora
        aseguradora.mostrarClientes();
        aseguradora.mostrarPolizas();

        // Mostrar seguros del cliente
        cliente.mostrarSeguros();
    }
}