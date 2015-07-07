public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private int age;

	public Pessoa(String nomeCompleto, String idade, int age) {
		this.nome = nomeCompleto;
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
	
	@Override
	public String toString() {
		return this.nome + " tem " + this.idade + " anos.";
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());
	}

}
