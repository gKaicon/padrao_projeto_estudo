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
public class SistemaDeAudio {
    public void configurarFrequencia() {
        System.out.println("Frequencia configurada");
    }

    public void configurarVolume() {
        System.out.println("Volume configurado");
    }

    public void configurarCanais() {
        System.out.println("Canais configurados");
    }

    public void reproduzirAudio(String arquivo) {
        System.out.println("Reproduzindo: " + arquivo);
    }
}
