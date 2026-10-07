package dispositivo;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre
                + "\nTipo: " + tipo);
    }

    void mostrarEstado() {
        String estado = activo ? "activo" : "inactivo";
        System.out.println("Estado: " + estado);
    }

    // Desafío adicional
    public void activar() {
        activo = true;
    }
}