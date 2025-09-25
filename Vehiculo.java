
public abstract class Vehiculo {
    // atributos comunes (protected)
    protected String marca;
    protected String modelo;
    protected int velocidad; // km/h

    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // getters públicos para acceder desde otras clases/paquetes
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidad() { return velocidad; }

    // setter protegido: las subclases pueden modificar velocidad
    protected void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    // método a sobrescribir por las subclases
    public abstract void acelerar();

    @Override
    public String toString() {
        return marca + " " + modelo + " (vel " + velocidad + " km/h)";
    }
}