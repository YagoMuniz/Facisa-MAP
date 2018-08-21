
public class Passageiro {
	
	private int numeroSmiles;
    private Pessoa pessoa;
    
    public Passageiro(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public int getNumeroSmiles(){
        return this.numeroSmiles;
    }
    
    public void setNumeroSmiles(int numeroSmiles){
        this.numeroSmiles = numeroSmiles;
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
