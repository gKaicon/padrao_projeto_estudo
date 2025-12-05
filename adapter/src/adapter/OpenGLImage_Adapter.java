/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author 0070110
 */
public class OpenGLImage_Adapter extends OpenGLImage implements ImagemTarget{

    @Override
    public void carregarImagem(String nomeDoArquivo) {
        glCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        glDesenharImagem(posX, posY);
    }
    
}
