package org.funcao;

import org.imp.AparelhoTelefonico;
import org.imp.NavegadorInternet;
import org.imp.ReprodutorMusical;

public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada foi: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando reprodução do corretio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página exibida foi: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adiconada com sucesso.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada com sucesso.");
    }
}