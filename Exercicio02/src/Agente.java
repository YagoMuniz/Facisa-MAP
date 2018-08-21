
public class Agente {
	
	private int idAgente;
    private Pessoa pessoa;
    
    public Agente(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public int getIdAgente(){
        return this.idAgente;
    }
    
    public void setIdAgente(int idAgente){
        this.idAgente = idAgente;
    }
    
    public void setNome(String nome){
        this.pessoa.setNome(nome);
    }
    
    public void setEndereco(String endereco){
        this.pessoa.setEndereco(endereco);
    }
    
    public String getNome(){
        return this.pessoa.getNome();
    }
    
    public String getEndereco(){
        return this.pessoa.getEndereco();
    }
}
