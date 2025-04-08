package org.example;

import java.util.List;

public class Inscripcion {

    public List<Materia> materiasNecesarias;

    public void setMateriasNecesarias(List<Materia> materiasNecesarias) {
        this.materiasNecesarias = materiasNecesarias;
    }

    public List<Materia> getMateriasNecesarias() {
        return materiasNecesarias;
    }

    public Boolean aprobada(Alumno alumno){
        return materiasNecesarias.stream().allMatch(materia -> materia.sePuedeAnotar(alumno));

    }
}