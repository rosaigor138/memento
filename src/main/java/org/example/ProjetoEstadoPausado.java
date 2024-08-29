package org.example;

public class ProjetoEstadoPausado implements ProjetoEstado {

    private ProjetoEstadoPausado() {};
    private static ProjetoEstadoPausado instance = new ProjetoEstadoPausado();

    public static ProjetoEstadoPausado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Pausado";
    }
}

