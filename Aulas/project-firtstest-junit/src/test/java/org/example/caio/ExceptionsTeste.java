package org.example.caio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeErroTransferencia() {
        Conta contaOrigem = new Conta(1212, 100);
        Conta contaDestino = new Conta(2112, 10);

        // Método para ver se está lançando a exceção esperada
        Assertions.assertThrows(IllegalArgumentException.class, // Deve ser informada a CLasse da exceção
                () -> TransferenciaContas.transferir(contaOrigem, contaDestino, -10));
    }

    @Test
    void validarCenarioSemErroTransferencia() {
        Conta contaOrigem = new Conta(1212, 100);
        Conta contaDestino = new Conta(2112, 10);

        // Método para ver se não será lançada exceção
        Assertions.assertDoesNotThrow(
                () -> TransferenciaContas.transferir(contaOrigem, contaDestino, 50)
        );
    }
}
