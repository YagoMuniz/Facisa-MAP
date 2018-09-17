package br.padroes.proxy;

public interface BancoUsuarios {
    
    private int quantidadeDeUsuarios = (int) (Math.random() * 100);
    private int usuariosConectados (int) (Math.random() * 10);
    
	public String getNumeroDeUsuarios();
	public String getUsuariosConectados();
}