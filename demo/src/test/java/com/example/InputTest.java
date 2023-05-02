package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


class InputTest {

    @Test
    void RetornaComando() {
        Input input = new Input();
        input.setComandos("UP");

        assertEquals("KEYS: - UP", input.getComandos());
    }

    @Test
    void RetornaComandoControle() {
        Input input = new Input();
        input.setComandos("UP");

        assertEquals("Comandos: - W", input.getComandosControle());
    }
}