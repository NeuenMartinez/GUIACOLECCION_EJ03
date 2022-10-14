/*
 * @author NeuenMartinez
 */
package ColeccionesEj_03;

import Entidades03.Alumno;
import Servicios03.AlumnoService;
import java.util.Scanner;

public class ColeccionesEj_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService as = new AlumnoService();
        Alumno a = new Alumno();
        as.crearAlumno();
        boolean aux = true;
        do {
            as.notaFinal();
            System.out.println("Desea saber la nota final de otro alumno: (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            String eleccion = leer.next();
            if (eleccion.equalsIgnoreCase("n")) {
                aux = false;
            } else {
                aux = true;
            }
        } while (aux == true);

    }

}
