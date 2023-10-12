package org.hugo.iphone;

public class TesteIphone {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone(new Telefone(), new ReprodutorMusical(), new NavegadorInternet());

        meuIphone.getTelefone().atender();
        meuIphone.getTelefone().ligar();
        meuIphone.getTelefone().iniciarCorreioVoz();

        meuIphone.getNavegador().adicionarNovaAba();
        meuIphone.getNavegador().atualizarPagina();
        meuIphone.getNavegador().exibirPagina();

        meuIphone.getRepMusical().pausar();
        meuIphone.getRepMusical().tocar();
        meuIphone.getRepMusical().selecionarMusica();


    }
}
