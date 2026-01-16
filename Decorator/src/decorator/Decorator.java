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
public class Decorator {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Coquetel meuDrink = new Vodka();
        System.out.println(meuDrink.getNome() + " = " + meuDrink.getPreco());
        meuDrink = new Suco(meuDrink);
        System.out.println(meuDrink.getNome() + " = " + meuDrink.getPreco());
        meuDrink = new Acucar(meuDrink);
        System.out.println(meuDrink.getNome() + " = " + meuDrink.getPreco());
        Coquetel daiquiri = new Acucar(new Limao(new Rum()));
        System.out.println("\nDaiquiri:");
        System.out.println(daiquiri.getNome() + " = " + daiquiri.getPreco());
    }
    
}
