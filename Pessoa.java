public class Pessoa {
	/*Atributos para pessoa*/
	private String sobrenome;
	private int idade;
	private int age;

	public Pessoa(String sobrenome, String idade, int age) {
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
