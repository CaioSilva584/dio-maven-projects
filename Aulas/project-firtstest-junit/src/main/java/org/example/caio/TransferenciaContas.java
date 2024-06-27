package org.example.caio;

public class TransferenciaContas {
    public static void transferir(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        } else {
            contaOrigem.setValor(contaOrigem.getValor() - valor);
            contaDestino.setValor(contaDestino.getValor() + valor);
        }
    }
}
