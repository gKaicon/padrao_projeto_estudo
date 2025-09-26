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
public class FabricaVW implements Fabrica{

    @Override
    public Automovel criarCarro() {
        Gol_VW gwv = new Gol_VW();
        return gwv;
    }    
}
