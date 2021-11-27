package vehiculos;

public class Camioneta extends Vehiculo{

    private static int cantidadCamionetas = 0;
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int peso, int precio, Fabricante fabricante, boolean volco){

        super(placa, nombre, puertas, 90, precio, peso, fabricante, "4X4");
        this.volco = volco;
        cantidadCamionetas++;

    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
