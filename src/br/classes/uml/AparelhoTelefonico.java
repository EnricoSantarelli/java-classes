package br.classes.uml;

import java.util.ArrayList;

public class AparelhoTelefonico extends Aplicativo {
        private ArrayList<String> contatos;


    public AparelhoTelefonico(ArrayList<String> contatos, String nome, int tamanho){
        super(nome, tamanho);
        this.contatos = contatos;
    }

    public void ligar(String contato){
        System.out.println("Ligando para " + contato);
    }

    public void atender(){
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    /**
     * @return ArrayList<String> return the contatos
     */
    public ArrayList<String> getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(ArrayList<String> contatos) {
        this.contatos = contatos;
    }

}
