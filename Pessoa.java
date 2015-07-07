public class Pessoa {

	private String nomePai;
	private int idade;
	private int age;

	public Pessoa(String nomeCompleto, String idade, int age) {
		this.nomePai = nomeCompleto;
		this.idade = idade;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nomePai = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
