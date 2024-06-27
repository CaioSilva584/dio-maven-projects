package org.example.caio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

// import estático para utilizar apenas os métodos sem precisar mencionar a classe
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamento(){

        int[] lancamento1 = {10, 20, 30, 40, 50};
        int[] lancamento2 = {-1, 5, 2, 3, 10};

        // Assertations
        assertNotEquals(lancamento1, lancamento2);
    }

    @Test
    void ifNull(){
        Pessoa pessoa = null;

        // Assertations
        assertNull(pessoa);

        Pessoa leandro = new Pessoa("Leandro", LocalDate.now());

        // Assertations
        assertNotNull(leandro);
    }

    @Test
    void validarNumerosTiposDiferentes(){
        double numero1 = 10.0;
        double numero2 = 10d;

        // Assertations
        assertEquals(numero1, numero2);
    }
}
