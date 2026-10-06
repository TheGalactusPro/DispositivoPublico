package dispositivo;

public class MainDispositivo {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();

        d1.setNombre("Teclado");
        d1.setTipo("Entrada");
        d1.setActivo(true);

        d2.setNombre("Mouse");
        d2.setTipo("Entrada");
        d2.setActivo(false);

        System.out.println("Dispositivo 1");
        d1.mostrarInformacion();
        d1.mostrarEstado();

        System.out.println("\nDispositivo 2");
        d2.mostrarInformacion();
        d2.mostrarEstado();
    }
}