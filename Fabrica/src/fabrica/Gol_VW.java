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
public class Gol_VW implements Automovel{

    String motor = "AP";
    String pneu = "Goodyear";
    String furaPneu = "Clash";
    String quandoEntra = "BRUM";

    @Override
    public void exibirInfo() {
        System.out.println("O motor é " + motor + "e tem pneu " + pneu);
    }

    @Override
    public void entra() {
        System.out.println(quandoEntra);
    }

    @Override
    public void quandoFuraPneu() {
        System.out.println(furaPneu);
    }

    @Override
    public void barulhoMotor() {
        System.out.println("Motor " + motor + " ligado");
    }
    
}
