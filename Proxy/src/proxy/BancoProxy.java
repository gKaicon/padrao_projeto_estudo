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
public class BancoProxy extends BancoUsuarios{
    protected String usuario, senha;

    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    // Verifica credenciais
    private boolean temPermissaoDeAcesso() {
        // Correção: Em Java usa-se .equals() para strings, não ==
        return "admin".equals(usuario) && "admin".equals(senha);
    }

    @Override
    public String getNumeroDeUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return null; // Acesso negado
    }

    @Override
    public String getUsuariosConectados() {
        if (temPermissaoDeAcesso()) {
            return super.getUsuariosConectados();
        }
        return null; // Acesso negado
    }
}
