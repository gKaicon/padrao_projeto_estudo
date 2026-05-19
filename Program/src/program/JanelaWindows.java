/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author 0070110
 */
public class JanelaWindows implements JanelaImplementada {
    
    @Override
    public void desenharJanela(String titulo) {
        // Simulação da implementação específica do Windows
        System.out.println("Janela Windows: " + titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println("Botão Windows: " + titulo);
    }
}
