package br.classes.uml;

public class NavegadorInternet extends Aplicativo {

    public NavegadorInternet(String nome, int tamanho) {
        super(nome, tamanho);
    }

    public void exibirPagina(String url){
        System.out.println("Página exibida em " + url);
    }

    public String adicionarNovaAba(String url){
        System.out.println("Nova aba adicionada");
        return url;
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
    
}
