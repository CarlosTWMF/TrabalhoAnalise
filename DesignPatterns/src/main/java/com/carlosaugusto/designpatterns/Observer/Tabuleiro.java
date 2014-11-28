package com.carlosaugusto.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Augusto
 */
public class Tabuleiro {
    List<Jogador> listaJogadores = new ArrayList<>();
    private int jogada;

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
        notificarJogadores();
    }
    
    public void adicionarObserver(Jogador observer){
        listaJogadores.add(observer);
    }
    
    public void notificarJogadores(){
        for (Jogador p:listaJogadores){
            p.receberNotificacao();
        }
    }
    
}
