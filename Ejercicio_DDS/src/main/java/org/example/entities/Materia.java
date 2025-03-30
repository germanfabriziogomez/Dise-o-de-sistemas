package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    //Constructor
    public Materia(String nombre)
    {
        this.nombre=nombre;
        this.correlativas= new ArrayList<Materia>();
    }

    public void agregarCorrelativa(Materia m)
    {
        this.correlativas.add(m);
    }

    public List<Materia> getCorrelativas()
    {
        return correlativas;
    }


}
