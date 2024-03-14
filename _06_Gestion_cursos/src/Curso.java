import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;

    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;
    private static int idEstudiante = 1;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }
    public void guardarEstudiante(Scanner objScan){
        System.out.println("Agregar nuevo estudiante\n");
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = objScan.next();
        System.out.println("Ingresa tu email");
        String email = objScan.next();

        Estudiante objEstudiante = new Estudiante(idEstudiante,nombre, email);
        idEstudiante++;
        if (this.listaEstudiantes.add(objEstudiante)){
            System.out.println("Estudiante agregado correctamente");
        } else {
            System.out.println("No se pudo agregar el estudiante");
        }

    }

    public void listarEstudiantes(){
        if(this.listaEstudiantes.isEmpty()){
            System.out.println("El curso" .concat(this.nombre).concat("No tiene estudiantes"));
        } else {
            System.out.println("\nLista de estudiantes en el curso - "+this.nombre);
            for (Estudiante estudianteTemp : this.listaEstudiantes){
                System.out.println(estudianteTemp.toString());
            }
        }
    }
    public void eliminarEstudiante(Scanner objScan){
        this.listarEstudiantes();

        System.out.println("Ingresa el identificador del estudiante");
        int idEliminar = objScan.nextInt();
        if (this.listaEstudiantes.removeIf(estudiante -> estudiante.getId()==idEliminar)){
            System.out.println("Se eliminó correctamente");
        } else {
            System.out.println("no se pudo eliminar");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
               "codigo='" + codigo + '\'' +
               ", nombre='" + nombre + '\''+
               '}';
    }
}
