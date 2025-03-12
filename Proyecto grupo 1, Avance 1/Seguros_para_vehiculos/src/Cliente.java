import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String cedula;
    private List<Seguro> seguros;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.seguros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void agregarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public void mostrarSeguros() {
        System.out.println("Seguros del cliente " + nombre + ":");
        for (Seguro seguro : seguros) {
            seguro.mostrarDetalles();
        }
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Cédula: " + cedula;
    }
}