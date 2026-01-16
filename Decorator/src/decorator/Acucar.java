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
public class Acucar extends CoquetelDecorator {
    public Acucar(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Açúcar";
        preco = 0.2; // Preço fictício
    }
}
