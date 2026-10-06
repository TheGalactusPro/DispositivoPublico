package dispositivo;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " +getNombre()+ "\nTipo: " +getTipo());
    }

    public void mostrarEstado() {
        String estado = activo ? "Estado: Activo" : "Estado: Inactivo";
        System.out.println(nombre + " " + estado);
    }

    public void activar() {
        if (!activo) {
            activo = true;
            System.out.println(nombre + " Ha sido activado");
        }
    }

    // Setters
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }
}