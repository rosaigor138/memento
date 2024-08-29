package org.example;

public class ProjetoEstadoPlanejado implements ProjetoEstado {

    private ProjetoEstadoPlanejado() {};
    private static ProjetoEstadoPlanejado instance = new ProjetoEstadoPlanejado();

    public static ProjetoEstadoPlanejado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Planejado";
    }
}
