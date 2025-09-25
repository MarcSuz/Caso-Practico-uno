

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int velocidad, boolean tieneSidecar) {
        super(marca, modelo, velocidad);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() { return tieneSidecar; }
    public void setTieneSidecar(boolean tieneSidecar) { this.tieneSidecar = tieneSidecar; }

    @Override
    public void acelerar() {
        velocidad += 15; // la moto acelera más rápido
        System.out.println("Moto " + marca + " acelera +15 km/h. Ahora: " + velocidad + " km/h. Sidecar: " + tieneSidecar);
    }
}