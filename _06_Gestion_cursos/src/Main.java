import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instancias
        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();
        int option= 0;

        do {
            System.out.println("""
                    Menu de opciones
                    1.Administrar curso
                    2.Administrar estudiantes
                    3.Salir
                    """);
            option= objScan.nextInt();

            switch (option){
                case 1:
                    int option2 = 0;
                    do {

                        System.out.println("""
                            MENU CURSOS
                            1.Crear un curso
                            2.Buscar curso por codigo
                            3.Listar cursos
                            4.Salir
                            """);
                        option2 = objScan.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.guardarCurso(objScan);
                                break;
                            case 2:
                                System.out.println("Ingresa el codigo del curso. ");
                                String codigo = objScan.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                                break;
                            case 3:
                                objGestion.listarCursos();
                                break;
                        }

                    } while (option2!= 4);
                    break;
                case 2:
                    int option3= 0;
                    do {
                        System.out.println("""
                                MENU ESTUDIANTES
                                1. Agregar estudiante
                                2. Eliminar estudiante
                                3. Listar estudiantes
                                4. Salir""");
                        option3 = objScan.nextInt();
                        switch (option3){
                            case 1:
                                objGestion.listarCursos();
                                System.out.println("Ingrese el codigo del curso donde desee inscribir el estudiante");
                                String codigo = objScan.next();
                                Curso curso = objGestion.buscarPorCodigo(codigo);

                                if (curso== null){
                                    System.out.println("curso no encontrado");
                                } else {
                                    curso.guardarEstudiante(objScan);
                                }
                                break;

                            case 2:
                                objGestion.listarCursos();
                                System.out.println("Ingrese el codigo del curso donde deseas eliminar un estudiante?");
                                codigo = objScan.next();
                                Curso objcurso = objGestion.buscarPorCodigo(codigo);
                                if (objcurso == null){
                                    System.out.println("codigo no válido");
                                } else {
                                    objcurso.eliminarEstudiante(objScan);
                                }
                                break;

                            case 3:
                                objGestion.listarCursos();
                                System.out.println("Ingrese el codigo del curso donde desee ver la lista de estudiantes");
                                codigo = objScan.next();
                                curso = objGestion.buscarPorCodigo(codigo);

                                if (curso== null){
                                    System.out.println("curso no encontrado");
                                } else {
                                    curso.listarEstudiantes();
                                }
                                break;

                        }
                    } while (option3 !=4);
                    break;
            }
        }while (option !=3);
    }
}