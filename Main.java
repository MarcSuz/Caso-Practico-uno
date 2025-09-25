
public class Main {

    public static void probarVehiculos() {
        Vehiculo[] vehs = new Vehiculo[] {
            new Auto("Toyota", "Corolla", 60, 4),
            new Moto("Yamaha", "MT-07", 50, false),
            new Camion("Volvo", "FH", 40, 12.5)
        };

        System.out.println("=== Prueba de vehículos (polimorfismo) ===");
        for (Vehiculo v : vehs) {
            System.out.println("Antes: " + v);
            v.acelerar();           // polimorfismo: la implementación ejecutada depende del tipo real
            System.out.println("Después: " + v);
            System.out.println();
        }

        // Encapsulación:
        // No podemos (ni debemos) acceder directamente a atributos privados de las subclases.
        // Tampoco es buena práctica manipular protected desde fuera del paquete/subclase.
        // Usamos getters públicos:
        System.out.println("Marca del primer vehículo (usando getter): " + vehs[0].getMarca());
    }

    public static void main(String[] args) {
        probarVehiculos();
    }
}

