package aulas.testedecomponentes;

/**
 * Class Carro
 * @author Caio Gomes Silva
 * @version 1.0
 *
 */

public class Carro {
    private String placa;
    private int qtdeRodas;

    /**
     * Metodo construtor
     * @param placa Recebe uma String para o atributo <b>placa</b>
     * @param qtdeRodas Recebe um inteiro para o atributo <b>quantidade de rodas</b>
     */
    public Carro(String placa, int qtdeRodas) {
        this.placa = placa;
        this.qtdeRodas = qtdeRodas;
    }

    /**
     * Metodo Get para placa
     * @return Retorna a placa do carro
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo Set para placa
     * @param placa Recebe uma nova placa para o carro
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo Get para a quantidade de rodas
     * @return Retorna a quantidade de rodas do carro
     */
    public int getQtdeRodas() {
        return qtdeRodas;
    }

    /**
     * Metodo Set para placa
     * @param qtdeRodas Recebe uma nova quantidade para o carro
     */
    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }
}
