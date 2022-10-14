package Entidades03;

import java.util.ArrayList;

/**
 *
 * @author NeuenMartinez
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> NotasArrayList;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> NotasArrayList) {
        this.nombre = nombre;
        this.NotasArrayList = NotasArrayList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotasArrayList() {
        return NotasArrayList;
    }

    public void setNotasArrayList(ArrayList<Integer> NotasArrayList) {
        this.NotasArrayList = NotasArrayList;
    }
}
