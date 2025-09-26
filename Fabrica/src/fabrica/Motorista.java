/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author 0048609
 */
public class Motorista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica ff = new FabricaFord();
        Automovel af = ff.criarCarro();
        af.exibirInfo();
        af.entra();
        af.barulhoMotor();
        af.quandoFuraPneu();
        
//        
//        Fabrica fv = new FabricaVW();
//        Automovel av = fv.criarCarro();
//        av.exibirInfo();
//        av.entra();
//        av.barulhoMotor();
//        av.quandoFuraPneu();
//        
        
    }
    
}
