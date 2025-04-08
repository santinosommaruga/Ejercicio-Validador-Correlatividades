package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class InscripcionTest {

    @Test
    @DisplayName("Un alumno hace una inscripcion a materias de forma correcta")
        public void hacerUnaInscripcion() {

        Materia fisica1 = new Materia();
        fisica1.setCodigo(101);
        fisica1.materiasNecesarias = new ArrayList<>();  // No necesita correlativas, puede ser la primer materia.

        Materia fisica2 = new Materia();
        fisica2.setCodigo(102); // Ejemplo de código
        fisica2.materiasNecesarias = new ArrayList<>();
        fisica2.materiasNecesarias.add(fisica1);  // Requiere que se apruebe la fisica1

        Materia simulacion = new Materia();
        simulacion.setCodigo(103);  // Ejemplo de código
        simulacion.materiasNecesarias = new ArrayList<>();

        Materia materia4 = new Materia();
        materia4.setCodigo(104); // Ejemplo de código
        materia4.materiasNecesarias = new ArrayList<>();
        materia4.materiasNecesarias.add(fisica2);  // Requiere que se apruebe la fisica2

        simulacion.materiasNecesarias.add(materia4);  // Requiere que se apruebe la fisica1
        // Crear un alumno
        Alumno alumno = new Alumno();
        alumno.setNombreApellido("Juan perez");
        alumno.setLegajo(12345);

        // Crear una lista de materias aprobadas
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(fisica1);  // El alumno aprobó la fisica1
        materiasAprobadas.add(fisica2);  // El alumno aprobó la fisica2
        alumno.setMateriasAprobadas(materiasAprobadas);

        // Crear una inscripción
        List<Materia> materiasAInscribir = new ArrayList<>();
        materiasAInscribir.add(simulacion); // El alumno quiere inscribirse a simulacion
        materiasAInscribir.add(materia4); // El alumno quiere inscribirse a materia4

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateriasNecesarias(materiasAInscribir);

        // Verificar si la inscripción es aprobada
        boolean esAprobada = inscripcion.aprobada(alumno);

        // Mostrar el resultado
        System.out.println("¿La inscripción es aprobada? " + esAprobada);

        assertTrue(esAprobada);
    }
    @Test
    @DisplayName("Un alumno hace una inscripcion y lo rechaza")
    public void noSePuedeHacerUnaInscripcion() {
        Materia fisica1 = new Materia();
        fisica1.setCodigo(101);
        fisica1.materiasNecesarias = new ArrayList<>();  // No necesita correlativas, puede ser la primer materia.

        Materia fisica2 = new Materia();
        fisica2.setCodigo(102); // Ejemplo de código
        fisica2.materiasNecesarias = new ArrayList<>();
        fisica2.materiasNecesarias.add(fisica1);  // Requiere que se apruebe la materia1

        Materia simulacion = new Materia();
        simulacion.setCodigo(103);  // Ejemplo de código
        simulacion.materiasNecesarias = new ArrayList<>();

        Materia inteligenciaA = new Materia();
        inteligenciaA.setCodigo(104); // Ejemplo de código
        inteligenciaA.materiasNecesarias = new ArrayList<>();
        inteligenciaA.materiasNecesarias.add(fisica2);  // Requiere que se apruebe la fisica2

        simulacion.materiasNecesarias.add(inteligenciaA);  // Requiere que se apruebe la materia1
        // Crear un alumno
        Alumno alumno = new Alumno();
        alumno.setNombreApellido("Juan perez");
        alumno.setLegajo(12345);

        // Crear una lista de materias aprobadas
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(fisica1);  // El alumno aprobó la materia1
        materiasAprobadas.add(fisica2);  // El alumno aprobó la fisica2
        alumno.setMateriasAprobadas(materiasAprobadas);

        // Crear una inscripción
        List<Materia> materiasAInscribir = new ArrayList<>();
        materiasAInscribir.add(simulacion); // El alumno quiere inscribirse a simulacion
        materiasAInscribir.add(inteligenciaA); // El alumno quiere inscribirse a inteligenciaA

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateriasNecesarias(materiasAInscribir);

        // Verificar si la inscripción es aprobada
        boolean esAprobada = inscripcion.aprobada(alumno);

        // Mostrar el resultado
        System.out.println("¿La inscripción es aprobada? " + esAprobada);


        assertFalse(esAprobada);
    }