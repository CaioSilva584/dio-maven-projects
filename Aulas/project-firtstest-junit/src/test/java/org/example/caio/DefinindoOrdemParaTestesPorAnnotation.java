package org.example.caio;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DefinindoOrdemParaTestesPorAnnotation {

    @Order(4)
    @Test
    void validaFlucoA(){

    }

    @Order(2)
    @Test
    void validaFlucoB(){

    }

    @Order(3)
    @Test
    void validaFlucoC(){

    }

    @Order(1)
    @Test
    void validaFlucoD(){

    }
}
