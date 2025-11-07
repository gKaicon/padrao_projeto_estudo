/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.util.Random;

/**
 *
 * @author 0048609
 */
public class MotorAco implements Motor {

    @Override
    public int qtdCilindros() {
        return new Random().nextInt(2) == 1 ? 8 : 4;
    }

    @Override
    public void exibirInfo() {
        System.out.println("O motor tem " + qtdCilindros() + " cilindros. ");
    }
}