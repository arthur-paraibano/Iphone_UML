package org.aplicacao;

import org.funcao.Iphone;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        System.out.println("-------------------");

        System.out.println("--Músicas--");
        iphone.tocar();
        iphone.pausar();
        System.out.print("Digite o nome da música: ");
        String musica = sc.nextLine();
        iphone.selecionarMusica(musica);

        System.out.println("--Telefone--");
        System.out.print("Digite o nome: ");
        String ligar = sc.nextLine();
        iphone.ligar(ligar);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("--Safari--");
        System.out.print("Qual o site: ");
        String url = sc.nextLine();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("-------------------");
        sc.close();
    }
}
