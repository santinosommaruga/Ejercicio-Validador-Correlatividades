package org.example;

import java.util.List;

public class Alumno {
    public List<Materia> materiasAprobadas;
    private String nombreApellido;
    private Integer legajo;

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    public void agregarMateriaAprobada(List<Materia> materiasAprobadas, Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }


}
