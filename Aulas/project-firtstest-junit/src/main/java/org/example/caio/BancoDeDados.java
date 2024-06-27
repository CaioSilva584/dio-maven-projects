package org.example.caio;

import java.util.logging.Logger;

public class BancoDeDados {

    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Conexao iniciada");
    }

    public static void finalizarConexao(){
        LOGGER.info("Conexao enncerrada");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Dados da pessoa inseridos");
    }

    public static void excluiDados(Pessoa pessoa){
        LOGGER.info("Dados da pessoa excluidos");
    }
}
