/*@Autor Nemuel Leal*/

public class Pessoa {
	
	/* Atributos*/

	private String nomePaiMae;
	private int idade;
	private int age;

	/*Construtor*/

	public Pessoa(String nomeCompleto, String idade, int age) {
		this.nomePaiMae = nomeCompleto;
		this.idade = idade;
		this.age = age;
	}

	/*Métodos*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nomePaiMae = nome;
}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
