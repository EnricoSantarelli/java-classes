package br.classes.uml;

public class Aplicativo {
    private String nome;
    private int tamanho;

    Aplicativo(String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void iniciarAplicativo(){
        System.out.println("Aplicativo iniciado");
    };

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
