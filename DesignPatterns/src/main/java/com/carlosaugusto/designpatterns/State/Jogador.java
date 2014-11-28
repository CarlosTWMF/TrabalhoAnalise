package com.carlosaugusto.designpatterns.State;

/**
 *
 * @author Carlos Augusto
 */
public class Jogador {

    private Tabuleiro estadoAtual;
    public Tabuleiro getEstadoAtual() {
        return estadoAtual;
    }
    public void setEstadoAtual(Tabuleiro estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void jogadaNormal() {
        estadoAtual.maximo3();
    }
    public void combo() {
        estadoAtual.maximo4();
    }
}
