public class Carro extends Vehiculo {

    //Atributos
    private int numPuertas;


    //Constructor
    public Carro(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }


    //Getter and Setters
    public int getNumPuertas() {
        return numPuertas;
    }


    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    @Override
    public String toString() {
        return super.toString() + "Carro [numPuertas: " + numPuertas+ "]";
    }


    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }
    
    
    
    
}
