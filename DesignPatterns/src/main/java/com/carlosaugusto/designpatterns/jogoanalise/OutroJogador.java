/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosaugusto.designpatterns.jogoanalise;


public class OutroJogador extends ObservableJogo21{
    
    public void fuiAlterado(){
        notificarTodos();
    }
    
}
