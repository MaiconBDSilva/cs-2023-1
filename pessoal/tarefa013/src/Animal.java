
public abstract class Animal {

	private String nome;
	private int idade;
	
	public String emitirSom() {
		return "Som do Animal";
	}
	
	public String movimento() {
		return "*Movimento do Animal*";
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
