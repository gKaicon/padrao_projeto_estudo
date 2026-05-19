/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author 0070110
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaAbstrata jan = new JanelaDialogo();
        jan.setJanela(new JanelaWindows());
        jan.desenhar();
        System.out.println(); // Equivalente ao Console.WriteLine()

        jan = new JanelaAviso();
        // Corrigido: adicionado 'new' antes de JanelaWindows()
        jan.setJanela(new JanelaWindows()); 
        jan.desenhar();
        System.out.println();


        jan = new JanelaDialogo();
        jan.setJanela(new JanelaLinux());
        jan.desenhar();
        System.out.println();


        jan = new JanelaAviso();
        // Corrigido: adicionado 'new' antes de JanelaLinux()
        jan.setJanela(new JanelaLinux()); 
        jan.desenhar();
        System.out.println();
    }
    
}
