package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Materia {
    public List<Materia> materiasNecesarias;
    private Integer codigo;
    private String nombreMateria;

    public void setMateriaNecesarias(List<Materia> materiasNecesarias) {
        this.materiasNecesarias = materiasNecesarias;
    }

    public List<Materia> getMateriaNecesarias() {
        return materiasNecesarias;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public boolean sePuedeAnotar(Alumno alumno){
        return alumno.materiasAprobadas.containsAll(materiasNecesarias);
    }
}
