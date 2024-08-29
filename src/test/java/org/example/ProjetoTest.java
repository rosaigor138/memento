package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    @Test
    void deveArmazenarEstados() {
        Projeto projeto = new Projeto();
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        projeto.setEstado(ProjetoEstadoEmAndamento.getInstance());
        projeto.setEstado(ProjetoEstadoPausado.getInstance());

        assertEquals(3, projeto.getEstados().size());
    }

    @Test
    void deveRestaurarEstadoInicial() {
        Projeto projeto = new Projeto();
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        projeto.setEstado(ProjetoEstadoEmAndamento.getInstance());
        projeto.setEstado(ProjetoEstadoPausado.getInstance());
        projeto.restauraEstado(0);

        assertEquals(ProjetoEstadoPlanejado.getInstance(), projeto.getEstado());
    }

    @Test
    void deveLancarExcecaoAoRestaurarEstadoInvalido() {
        Projeto projeto = new Projeto();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            projeto.restauraEstado(0);
        });

        assertEquals("Índice inválido", exception.getMessage());
    }
}
