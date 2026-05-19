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
public class SistemasFacade {
    protected SistemaDeAudio audio;
    protected SistemaDeInput input;
    protected SistemaDeVideo video;

    public void inicializarSubsistemas() {
        // Inicializa e configura o Vídeo
        video = new SistemaDeVideo();
        video.configurarCores();
        video.configurarResolucao();

        // Inicializa e configura o Input
        input = new SistemaDeInput();
        input.configurarJoystick();
        input.configurarTeclado();

        // Inicializa e configura o Áudio
        audio = new SistemaDeAudio();
        audio.configurarCanais();
        audio.configurarFrequencia();
        audio.configurarVolume();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
        video.renderizarImagem(imagem);
    }

    public void lerInput() {
        input.lerInput();
    }
}
