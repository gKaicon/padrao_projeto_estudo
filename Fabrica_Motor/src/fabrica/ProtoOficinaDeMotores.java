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
public class ProtoOficinaDeMotores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica ff = new FabricaBrasileira();
        Motor af = ff.criarMotor();
        af.exibirInfo();
        
//        
//        Fabrica fv = new FabricaVW();
//        Motor av = fv.criarCarro();
//        av.exibirInfo();
//        av.entra();
//        av.barulhoMotor();
//        av.quandoFuraPneu();
//        
        
    }
    
}
