package org.example.entities;

import java.util.List;


public class Inscripcion {

    private Alumno alu;
    private List<Materia> materiasAInscribirse;

    public boolean aprobada()
    {
        boolean ret=true;
        List<Materia> necesitaAprobadas = this.materiasAInscribirse.stream().flatMap(materia -> materia.getCorrelativas().stream()).toList();
        for (Materia correlativa : necesitaAprobadas) {
            if (!alu.aproboMateria(correlativa)) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    //Constructor
    public Inscripcion(Alumno alu, List<Materia> materias)
    {
        this.alu= alu;
        this.materiasAInscribirse=materias;
    }

}
