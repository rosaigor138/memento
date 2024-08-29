package org.example;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private ProjetoEstado estado;
    private List<ProjetoEstado> memento = new ArrayList<>();

    public ProjetoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ProjetoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ProjetoEstado> getEstados() {
        return this.memento;
    }
}
