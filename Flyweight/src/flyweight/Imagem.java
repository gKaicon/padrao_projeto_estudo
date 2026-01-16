/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author 0070110
 */
public class Imagem {
    protected String nomeDaImagem;

    public Imagem(String imagem) {
        this.nomeDaImagem = imagem;
    }

    public void desenharImagem() {
        System.out.print(nomeDaImagem + " desenhada! ");
    }
}
