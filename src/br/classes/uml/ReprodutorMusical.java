package br.classes.uml;

import java.util.ArrayList;

public class ReprodutorMusical extends Aplicativo {
    private ArrayList<String> musicas;


    public ReprodutorMusical(ArrayList<String> musicas, String nome, int tamanho){
        super(nome, tamanho);
        this.musicas = musicas;
    }

    public void tocar(String musica){
        System.out.println("Tocando " + musica);
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public String selecionarMusica(String musica){
        System.out.println("Musica selecionada: " + musica);
        return musica;
    }

    /**
     * @return ArrayList<String> return the musicas
     */
    public ArrayList<String> getMusicas() {
        return musicas;
    }

    /**
     * @param musicas the musicas to set
     */
    public void setMusicas(ArrayList<String> musicas) {
        this.musicas = musicas;
    }

}