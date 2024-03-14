import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        GestionEmpleado objGestion = new GestionEmpleado();
        int option= 0;
        do {

            try{
                System.out.println("""
                        MENU
                        1.AGREGAR EMPLEADOS
                        2.ELIMINAR EMPLEADOS
                        3.LISTAR EMPLEADOS
                        4.SALIR""");
                option = objScan.nextInt();
                switch (option){
                    case 1:
                        objGestion.añadirEmpleado(objScan);
                        break;
                    case 2:
                        objGestion.eliminarEmpleado(objScan);
                        break;
                    case 3:
                        objGestion.listarEmpleados();
                        break;
                }
            }catch (Exception e){
                System.out.println("caracter no valido"+e);
            }
        }while (option!=4);
        }
    }
