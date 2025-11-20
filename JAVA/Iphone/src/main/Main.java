package main;

import model.Iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Back in Black");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("99462-4537");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
