package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    //Constructor
    public Alumno(String nom)
    {
        this.nombre=nom;
        this.materiasAprobadas= new ArrayList<Materia>();
    }

    public void aprobarMateria(Materia m)
    {
        this.materiasAprobadas.add(m);
    }

    public boolean aproboMateria(Materia m) {
        return this.materiasAprobadas.contains(m);
    }


}
