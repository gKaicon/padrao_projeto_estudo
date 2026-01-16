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
public class Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        // O mesmo objeto de imagem é reutilizado, mudando apenas a posição (Ponto)
        factory.getFlyweight(FlyweightFactory.Sprites.CENARIO_1).desenharImagem(new Ponto(0, 0));
        
        factory.getFlyweight(FlyweightFactory.Sprites.JOGADOR).desenharImagem(new Ponto(10, 10));
        
        // Vários inimigos do mesmo tipo (mesma imagem na memória), em posições diferentes
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(100, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(120, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(140, 10));
        
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenharImagem(new Ponto(60, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenharImagem(new Ponto(50, 10));
        
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_3).desenharImagem(new Ponto(170, 10));
    }
    
}
