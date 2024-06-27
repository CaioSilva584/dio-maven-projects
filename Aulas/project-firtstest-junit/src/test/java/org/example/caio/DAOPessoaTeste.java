package org.example.caio;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class DAOPessoaTeste {

    @BeforeAll  // Primeira coisa a acontecer
    // Deve ser fornecido um método estático? Este teste é feito durante a execução normal do código?
    // Talvez seja apenas realizado para efeito de teste, por exemplo, caso seja necessário conectar com o banco
    // antes de realizar os testes pois os testes dependem de dados do banco
    static void configuraConexaoBancoDeDados(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach // Antes de cada teste, execute a operação especificada
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Carlos", LocalDate.now()));
    }

    @AfterEach  // Depois de cada teste, execute a operação especificada
    void removeDadosDoTeste(){
        BancoDeDados.excluiDados(new Pessoa("Carlos", LocalDate.now()));
    }

    @Test
    void testeQualquer1(){
        Assertions.assertEquals(22, 22);
    }

    @Test
    void testeQualquer2(){
        Assertions.assertFalse(23 > 24);
    }

    @Test
    void testeQualquer3(){
        Assertions.assertTrue(22 == 22);
    }

    @AfterAll
    static void EncerraConexaoBancoDeDados(){
        BancoDeDados.finalizarConexao();
    }
}
