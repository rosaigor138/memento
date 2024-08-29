package org.example;

public class ProjetoEstadoConcluido implements ProjetoEstado {

    private ProjetoEstadoConcluido() {};
    private static ProjetoEstadoConcluido instance = new ProjetoEstadoConcluido();

    public static ProjetoEstadoConcluido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Concluído";
    }
}
