package org.example.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionExitosaTest {

    @DisplayName("Test en donde la inscripcion fue exitosa")
    @Test
    public void inscripcionAprobada()
    {
        Alumno alu = new Alumno("Alumno de prueba");
        List<Materia> matAInscribirse = new ArrayList<Materia>();

        //Creo materias
        Materia analisisi = new Materia("Analisis I");
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos");
        Materia pdep = new Materia("Paradigmas de programacion");
        Materia analisisii = new Materia("Analisis II");

        //Agrego correlativas
        pdep.agregarCorrelativa(ayed);
        analisisii.agregarCorrelativa(analisisi);

        //Cargo materias a la lista
        matAInscribirse.add(analisisii);
        matAInscribirse.add(pdep);

        //Supongo que el alumno aprobo ayed y analisis i
        alu.aprobarMateria(ayed);
        alu.aprobarMateria(analisisi);

        //Creo inscripcion
        Inscripcion ins= new Inscripcion(alu,matAInscribirse);

        //Verifico
        assertTrue(ins.aprobada());
    }


}