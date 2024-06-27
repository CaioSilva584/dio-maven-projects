package org.example.caio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class PessoaTeste {

    @Test   // a anotação é obrigatória para a rotina ser um teste
    void isMaiorDeIdade(){  // Métodos de teste nunca retornam nada
        Pessoa caio = new Pessoa("Caio", LocalDate.of(2001, 12, 14));

        // Classe Assertations para realizar os testes
        Assertions.assertTrue(caio.maiorDeIdade());

    }

    @Test
    void calculaIdadeCorretamente(){
        Pessoa caio = new Pessoa("Caio", LocalDate.of(2001, 12, 14));

        Assertions.assertEquals(22, caio.getIdade());
    }


}
