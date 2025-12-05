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
public class JanelaAbstrata {
    protected JanelaImplementada janela;
    public JanelaImplementada getJanela() {
        return janela;
    }

    public void setJanela(JanelaImplementada janela) {
        this.janela = janela;
    }

    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }

    public void desenhar() {
        
    }
}
