public class Moto extends Vehiculo{

    //Atributos
    private boolean tieneSidecar;


    //Constructor
    public Moto(String marca, String modelo, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }


    //Getter and Setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }


    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }


    @Override
    public String toString() {
        return super.toString() + "Moto [tieneSidecar: " + tieneSidecar + "]";
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }

    
    
    
}
