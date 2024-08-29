package org.example;

public class ProjetoEstadoCancelado implements ProjetoEstado {

    private ProjetoEstadoCancelado() {};
    private static ProjetoEstadoCancelado instance = new ProjetoEstadoCancelado();

    public static ProjetoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }
}
