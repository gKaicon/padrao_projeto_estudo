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
public class SDL_Surface {
    public void SDLCarregarSurface(String arquivo){
        System.out.println("Imagem " + arquivo + " carregada.");
    }
    public void SDLDesenharSurface(int largura, int altura,int posicaoX, int posicaoY){
        System.out.println("SDLSurface desenhada");
    }
}
