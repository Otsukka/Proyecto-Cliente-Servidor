import java.util.ArrayList;
import java.util.List;

class Aseguradora {
    private String nombre;
    private List<Cliente> clientes;
    private List<Poliza> polizas;

    public Aseguradora(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.polizas = new ArrayList<>();
    }

    // Agregar un cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Agregar una póliza
    public void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }

    // Mostrar todos los clientes
    public void mostrarClientes() {
        System.out.println("Clientes de la aseguradora " + nombre + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente); // Usa el método toString() de Cliente
        }
    }

    // Mostrar todas las pólizas
    public void mostrarPolizas() {
        System.out.println("Pólizas de la aseguradora " + nombre + ":");
        for (Poliza poliza : polizas) {
            poliza.mostrarDetalles();
        }
    }
}