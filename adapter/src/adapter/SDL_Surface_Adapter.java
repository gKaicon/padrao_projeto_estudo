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
public class SDL_Surface_Adapter extends SDL_Surface implements ImagemTarget{

    @Override
    public void carregarImagem(String nomeDoArquivo) {
         SDLCarregarSurface(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        SDLDesenharSurface(largura, altura, posX, posY);
    }
    
}
