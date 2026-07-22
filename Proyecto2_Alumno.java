import java.util.Scanner;
import java.util.Stack;

public class Proyecto2_Alumno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaEnlazada lista = new ListaEnlazada();
        ListaDoble listaDoble = new ListaDoble();
        Stack<String> historial = new Stack<>();

        int opcion;

        do {

            System.out.println("\n=====================================");
            System.out.println(" SISTEMA DE GESTION DE CURSOS UTC 2.0");
            System.out.println("=====================================");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Buscar curso por clave");
            System.out.println("4. Eliminar curso");
            System.out.println("5. Inscribir estudiante");
            System.out.println("6. Dar de baja estudiante");
            System.out.println("7. Mostrar cursos de inicio a fin");
            System.out.println("8. Mostrar cursos de fin a inicio");
            System.out.println("9. Navegador de cursos");
            System.out.println("10. Contar cursos (Recursividad)");
            System.out.println("11. Buscar curso (Recursividad)");
            System.out.println("12. Historial");
            System.out.println("13. Salir");

            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:

                    System.out.print("Clave: ");
                    String clave = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Docente: ");
                    String docente = sc.nextLine();

                    System.out.print("Cupo máximo: ");
                    int cupo = Integer.parseInt(sc.nextLine());

                    Curso nuevo = new Curso(clave, nombre, docente, cupo);

                    lista.agregar(nuevo);
                    listaDoble.agregar(nuevo);

                    historial.push("Curso agregado: " + clave);

                    System.out.println("Curso agregado correctamente.");

                    break;

                case 2:

                    lista.mostrar();

                    break;

                case 3:

                    System.out.print("Clave a buscar: ");
                    String buscar = sc.nextLine();

                    Curso encontrado = lista.buscar(buscar);

                    if (encontrado != null) {

                        System.out.println("Curso encontrado");
                        System.out.println("Clave: " + encontrado.clave);
                        System.out.println("Nombre: " + encontrado.nombre);
                        System.out.println("Docente: " + encontrado.docente);
                        System.out.println("Inscritos: "
                                + encontrado.inscritos + "/"
                                + encontrado.cupoMaximo);

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;

                case 4:

                    System.out.print("Clave del curso: ");
                    String eliminar = sc.nextLine();

                    if (lista.eliminar(eliminar)) {

                        historial.push("Curso eliminado: " + eliminar);
                        System.out.println("Curso eliminado.");

                    } else {

                        System.out.println("No existe.");

                    }

                    break;

                case 5:

                    System.out.print("Clave del curso: ");
                    String inscribir = sc.nextLine();

                    Curso c = lista.buscar(inscribir);

                    if (c != null) {

                        if (c.inscritos < c.cupoMaximo) {

                            c.inscritos++;

                            historial.push("Inscripción en " + c.clave);

                            System.out.println("Inscripción realizada.");

                        } else {

                            System.out.println("Curso lleno.");

                        }

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;
                                    case 6:

                    System.out.print("Clave del curso: ");
                    String baja = sc.nextLine();

                    Curso cursoBaja = lista.buscar(baja);

                    if (cursoBaja != null) {

                        if (cursoBaja.inscritos > 0) {

                            cursoBaja.inscritos--;

                            historial.push("Baja en " + cursoBaja.clave);

                            System.out.println("Baja realizada.");

                        } else {

                            System.out.println("No hay estudiantes inscritos.");

                        }

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;

                case 7:

                    System.out.println("\n=== CURSOS DE INICIO A FIN ===");
                    listaDoble.mostrarInicioFin();

                    break;

                case 8:

                    System.out.println("\n=== CURSOS DE FIN A INICIO ===");
                    listaDoble.mostrarFinInicio();

                    break;

                case 9:

                    int opCarrusel;

                    do {

                        System.out.println("\n===== NAVEGADOR DE CURSOS =====");
                        System.out.println("1. Ver curso actual");
                        System.out.println("2. Siguiente");
                        System.out.println("3. Anterior");
                        System.out.println("4. Salir");
                        System.out.print("Opción: ");

                        opCarrusel = Integer.parseInt(sc.nextLine());

                        switch (opCarrusel) {

                            case 1:
                                listaDoble.mostrarActual();
                                break;

                            case 2:
                                listaDoble.siguiente();
                                listaDoble.mostrarActual();
                                break;

                            case 3:
                                listaDoble.anterior();
                                listaDoble.mostrarActual();
                                break;

                            case 4:
                                System.out.println("Saliendo del navegador...");
                                break;

                            default:
                                System.out.println("Opción inválida.");

                        }

                    } while (opCarrusel != 4);

                    break;

                case 10:

                    System.out.println("Total de cursos: "
                            + lista.contarCursos());

                    break;

                case 11:

                    System.out.print("Clave a buscar: ");
                    String claveRec = sc.nextLine();

                    Curso cursoRec = lista.buscarRecursivo(claveRec);

                    if (cursoRec != null) {

                        System.out.println("Curso encontrado");
                        System.out.println("Clave: " + cursoRec.clave);
                        System.out.println("Nombre: " + cursoRec.nombre);
                        System.out.println("Docente: " + cursoRec.docente);
                        System.out.println("Inscritos: "
                                + cursoRec.inscritos + "/"
                                + cursoRec.cupoMaximo);

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;

                case 12:

                    System.out.println("\n===== HISTORIAL =====");

                    if (historial.isEmpty()) {

                        System.out.println("No hay acciones registradas.");

                    } else {

                        for (String accion : historial) {

                            System.out.println(accion);

                        }

                    }

                    break;

                case 13:

                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 13);

        sc.close();

    }

}
                    
