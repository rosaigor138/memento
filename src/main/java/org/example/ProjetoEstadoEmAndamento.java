package org.example;

public class ProjetoEstadoEmAndamento implements ProjetoEstado {

    private ProjetoEstadoEmAndamento() {};
    private static ProjetoEstadoEmAndamento instance = new ProjetoEstadoEmAndamento();

    public static ProjetoEstadoEmAndamento getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em Andamento";
    }
}
