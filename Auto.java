

public class Auto extends Vehiculo {
    // atributo propio (encapsulado como private)
    private int numPuertas;

    public Auto(String marca, String modelo, int velocidad, int numPuertas) {
        super(marca, modelo, velocidad);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    @Override
    public void acelerar() {
        // uso del atributo protected 'velocidad' heredado
        velocidad += 10; // el auto acelera +10 km/h
        System.out.println("Auto " + marca + " acelera +10 km/h. Ahora: " + velocidad + " km/h.");
    }
}