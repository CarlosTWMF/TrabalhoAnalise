package com.carlosaugusto.designpatterns.State;

/**
 *
 * @author Carlos Augusto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador personagem = new Jogador();
        System.out.println("Começando jogo com tabuleiro vazio.");
        personagem.setEstadoAtual(new TabuleiroVazio());
        personagem.jogadaNormal();
        personagem.combo();
        
        System.out.println("Jogadas com tabuleiro pela metade.");
        personagem.setEstadoAtual(new TabuleiroMetade());
        personagem.jogadaNormal();
        personagem.combo();
        
        System.out.println("Jogadas com tabuleiro cheio.");
        personagem.setEstadoAtual(new TabuleiroCheio());
        personagem.jogadaNormal();
        personagem.combo();
    }
}
