public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("KIA", "2019", 120, 4);
        Moto moto1 = new Moto("Suzuki", "2024", 130, false);

        System.out.println("***********************");
        carro1.mostrarDetalles();
        System.out.println("***********************");
        moto1.mostrarDetalles();
        System.out.println("***********************");


        carro1.setVelocidadMaxima(110);
        carro1.setModelo("2023");

        moto1.setTieneSidecar(true);
        moto1.setVelocidadMaxima(150);

        System.out.println("***********************");
        carro1.mostrarDetalles();
        System.out.println("***********************");
        moto1.mostrarDetalles();
        System.out.println("***********************");
    }
}
