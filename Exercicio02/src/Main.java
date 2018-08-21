
public class Main {
	
	public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        
        Tripulante tripulante = new Tripulante(pessoa);
        tripulante.setNome("Am�rico dos Santos");
        tripulante.setEndereco("Rua das Orqu�dias");
        tripulante.setIdTripulante(1);
        
        System.out.println("\nTripulante");
        System.out.println("Id: " + tripulante.getIdTripulante());
        System.out.println("Nome: " + tripulante.getNome());
        System.out.println("Endere�o: " + tripulante.getEndereco());
        
        Agente agente = new Agente(pessoa);
        agente.setNome("Morgana Alves");
        agente.setEndereco("Rua dos agentes");
        agente.setIdAgente(1);
        
        System.out.println("\nAgente");
        System.out.println("Id: " + agente.getIdAgente());
        System.out.println("Nome: " + agente.getNome());
        System.out.println("Endere�o: " + agente.getEndereco());
        
        Passageiro passageiro = new Passageiro(pessoa);
        passageiro.setNome("Maria Jos� da Silva");
        passageiro.setEndereco("Avenida Cobradores de �nibus");
        passageiro.setNumeroSmiles(2);
        
        System.out.println("\nTripulante");
        System.out.println("N�mero Smiles: " + passageiro.getNumeroSmiles());
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Endere�o: " + passageiro.getEndereco());
    }
}
