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
public class BancoUsuarios {
    private int quantidadeDeUsuarios;
    private int usuariosConectados;

    public BancoUsuarios() {
        this.quantidadeDeUsuarios = (int) (Math.random() * 100);
        this.usuariosConectados = (int) (Math.random() * 10);
    }

    public String getNumeroDeUsuarios() {
        return "Total de usuários: " + quantidadeDeUsuarios;
    }

    public String getUsuariosConectados() {
        return "Usuários conectados: " + usuariosConectados;
    }
}
