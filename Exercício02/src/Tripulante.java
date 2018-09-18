
public class Tripulante {
	
	private int idTripulante;
    private Pessoa pessoa;
    
    public Tripulante(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public int getIdTripulante(){
        return this.idTripulante;
    }
    
    public void setIdTripulante(int idTripulante){
        this.idTripulante = idTripulante;
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
