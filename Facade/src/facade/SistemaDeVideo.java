/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author 0070110
 */
public class SistemaDeVideo {
    public void configurarCores() {
        System.out.println("Cores configuradas");
    }

    public void configurarResolucao() {
        System.out.println("Resolução configurada");
    }

    public void renderizarImagem(String imagem) {
        System.out.println("Renderizando imagem: " + imagem);
    }
}
