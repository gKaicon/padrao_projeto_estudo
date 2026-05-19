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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImagemTarget imagem = new SDL_Surface_Adapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0,0,10,10);
        
        imagem = new OpenGLImage_Adapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0,0,10,10);
    }
    
}
