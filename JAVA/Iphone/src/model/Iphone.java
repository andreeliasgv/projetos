package model;

import feature.Navegador;
import feature.ReprodutorMusical;
import feature.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Reproducao pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica " + musica + " foi selecionada.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
    
    
}
