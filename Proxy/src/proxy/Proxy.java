/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author 0070110
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Tentativa de acesso não autorizado
        System.out.println("--- Hacker acessando ---");
        BancoUsuarios banco = new BancoProxy("Hacker", "1234");
        System.out.println(banco.getNumeroDeUsuarios());     // Deve imprimir null
        System.out.println(banco.getUsuariosConectados());   // Deve imprimir null

        System.out.println("\n--- Administrador acessando ---");
        // Tentativa de acesso autorizado
        banco = new BancoProxy("admin", "admin");
        System.out.println(banco.getNumeroDeUsuarios());     // Imprime dados reais
        System.out.println(banco.getUsuariosConectados());   // Imprime dados reais
    }
    
}
