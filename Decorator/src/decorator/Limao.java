/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author 0070110
 */
public class Limao extends CoquetelDecorator {
    public Limao(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Limão";
        preco = 0.5; // Preço fictício
    }
}
