package Servicios03;

import Entidades03.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class AlumnoService {

    ArrayList<Alumno> ListaAlumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean aux = true;

    public void crearAlumno() {
        do {

            System.out.println("Ingresar el nombre del Alumno:");
            String nom = leer.next();
            System.out.println("Ingresar las 3 notas:");
            ArrayList<Integer> notas = new ArrayList<>();
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            ListaAlumnos.add(new Alumno(nom, notas));
            System.out.println("Desea agregar otro Alumno: (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            String eleccion = leer.next();
            if (eleccion.equalsIgnoreCase("n")) {
                aux = false;
            } else {
                aux = true;
            }

        } while (aux == true);

    }

    public void notaFinal() {
        boolean aux = false;
        System.out.println("Ingresar el Alumno a buscar:");
        String nombre = leer.next();
        for (int i = 0; i < ListaAlumnos.size(); i++) {
            if (ListaAlumnos.get(i).getNombre().equals(nombre)) {
                calcularNotaFinal(i);
            } else {
                aux = true;
            }
        }
        if (aux == true) {
            System.out.println("El alumno ingresado no se encuentra en la lista");
        }
    }

    public void calcularNotaFinal(int aux) {
        System.out.println("La nota final del Alumno " + ListaAlumnos.get(aux).getNombre() + " es:");
        System.out.println((ListaAlumnos.get(aux).getNotasArrayList().get(0) + ListaAlumnos.get(aux).getNotasArrayList().get(1) + ListaAlumnos.get(aux).getNotasArrayList().get(2)) / 3);
    }

}
