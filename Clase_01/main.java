public class main {
    public static void main(String[] args) {
        
        //Objetos o instancias

        Estudiante estudiante1 = new Estudiante("Anderson Mesa", 23, 4.5);
        Estudiante estudiante2 = new Estudiante("Juan Perez", 20, 2.2);
        Estudiante estudiante3 = new Estudiante("Pedro Gomzalez", 27, 3.3);

        estudiante1.mostrarDetalles();
        estudiante1.esAprobado();
        System.out.println("**************************************");
        estudiante2.mostrarDetalles();
        estudiante2.esAprobado();
        System.out.println("**************************************");
        estudiante3.mostrarDetalles();
        estudiante3.esAprobado();
    }
}
