package org.example.caio;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DefinindoOrdemParaTestesPorDisplayName {

    @DisplayName("Teste B")
    @Test
    void validaFlucoB(){

    }

    @DisplayName("Teste A")
    @Test
    void validaFlucoA(){

    }

    @DisplayName("Teste D")
    @Test
    void validaFlucoD(){

    }

    @DisplayName("Teste C")
    @Test
    void validaFlucoC(){

    }
}
