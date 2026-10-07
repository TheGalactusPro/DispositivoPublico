package dispositivo;

public class MainDispositivo {
    public static void main() {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();

        d1.nombre = "Teclado";
        d1.tipo = "Entrada";
        d1.activo = true;

        d2.nombre = "Monitor";
        d2.tipo = "Salida";
        d2.activo = false;

        System.out.println("Dispositivo 1");
        d1.mostrarInformacion();
        d1.mostrarEstado();

        System.out.println("\nDispositivo 2");
        d2.mostrarInformacion();
        d2.mostrarEstado();

        d1.activo = false;

        System.out.println("\nDespués de modificar el dispositivo 1");

        System.out.println("\nDispositivo 1");
        d1.mostrarInformacion();
        d1.mostrarEstado();

        System.out.println("\nDispositivo 2");
        d2.mostrarInformacion();
        d2.mostrarEstado();
    }
}