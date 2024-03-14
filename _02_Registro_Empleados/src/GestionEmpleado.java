import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleado {
    private ArrayList<Empleado>listaEmpleados;

    public GestionEmpleado() {
        listaEmpleados= new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void añadirEmpleado(Scanner objScan){
        System.out.println("Ingresa el nombre del empleado para añadir");
        String nuevoEmpleado = objScan.next();
        System.out.println("Ingresa la edad del empleado");
        int edad = objScan.nextInt();
        System.out.println("Ingresa el id del empleado");
        int id = objScan.nextInt();
        System.out.println("ingresa el salario del nuevo empleado");
        double salario = objScan.nextDouble();
        Empleado empleado = new Empleado(nuevoEmpleado,edad,id,salario);
        listaEmpleados.add(empleado);
        System.out.println("Se agrego");

    }
    public void añadirEmpleadoTemporal(Scanner objScan){
        System.out.println("Ingresa el nombre del empleado para añadir");
        String nuevoEmpleado = objScan.next();
        System.out.println("Ingresa la edad del empleado");
        int edad = objScan.nextInt();
        System.out.println("Ingresa el id del empleado");
        int id = objScan.nextInt();
        System.out.println("ingresa el salario del nuevo empleado");
        double salario = objScan.nextDouble();
        Empleado empleado = new EmpleadoTemporal(nuevoEmpleado,edad,id,salario);
        listaEmpleados.add(empleado);

    }
    public void añadirEmpleadoPermanente(Scanner objScan){
        System.out.println("Ingresa el nombre del empleado para añadir");
        String nuevoEmpleado = objScan.next();
        System.out.println("Ingresa la edad del empleado");
        int edad = objScan.nextInt();
        System.out.println("Ingresa el id del empleado");
        int id = objScan.nextInt();
        System.out.println("ingresa el salario del nuevo empleado");
        double salario = objScan.nextDouble();
        Empleado empleado = new EmpleadoPermanente(nuevoEmpleado,edad,id,salario);
        listaEmpleados.add(empleado);

    }
    public void listarEmpleados(){
        if (listaEmpleados.isEmpty()){
            System.out.println("la lista està vacia");
        } else {
            for (Empleado tempo: listaEmpleados){

                System.out.println(tempo.getNombre());
            }
        }

    }
    public void eliminarEmpleado(Scanner objScan){

        this.listarEmpleados();
        System.out.println("Ingresa el nombre del empleado a eliminar");
        String nombreEliminar= objScan.next();
        if (listaEmpleados.removeIf(empleado ->empleado.getNombre().equalsIgnoreCase(nombreEliminar))){
            System.out.println("Se eliminò correctamente");
        } else {
            System.out.println("no se eliminò correctamente");
        }
    }
}
