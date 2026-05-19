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
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("##### Configurando subsistemas #####");
        
        // Instancia a Facade
        SistemasFacade fachada = new SistemasFacade();
        
        // A Facade cuida de toda a complexidade de instanciar e configurar os objetos
        fachada.inicializarSubsistemas();

        System.out.println("\n##### Utilizando subsistemas #####");
        
        // O cliente chama métodos simples, sem saber qual subsistema realiza a ação
        fachada.renderizarImagem("imagem.png");
        fachada.reproduzirAudio("teste.mp3");
        fachada.lerInput();
    }
    
}
