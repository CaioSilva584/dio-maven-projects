package org.example.caio;

public class Conta {
    private int numero;
    private int valor;

    public Conta(int numero, int valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public int getValor() {
        return valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
