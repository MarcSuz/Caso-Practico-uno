

public class Camion extends Vehiculo {
    private double capacidadCarga; // toneladas

    public Camion(String marca, String modelo, int velocidad, double capacidadCarga) {
        super(marca, modelo, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    @Override
    public void acelerar() {
        velocidad += 5; // el camión acelera despacio
        System.out.println("Camión " + marca + " acelera +5 km/h. Ahora: " + velocidad + " km/h. Capacidad: " + capacidadCarga + " t.");
    }
}