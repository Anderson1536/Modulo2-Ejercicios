public class Estudiante {

    //Atributos
    String nombre;
    int edad;
    double promedio;

    //Metodos

    //Constructor
    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    public void  esAprobado(){
        if(promedio >= 3.0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
