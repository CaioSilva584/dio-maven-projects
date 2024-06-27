package org.example.caio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate dtNasc;

    public Pessoa(String nome, LocalDate dtNasc) {
        this.nome = nome;
        this.dtNasc = dtNasc;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dtNasc, LocalDate.now());
    }

    public boolean maiorDeIdade(){
        return getIdade() > 18;
    }
}
