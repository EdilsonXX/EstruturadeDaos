package prova;

public class Paciente {

	private String rg;
	private String nome;
	private int idade;
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public Paciente(String rg, String nome, int idade) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.idade = idade;
	}
	public Paciente() {
		super();
	}
	@Override
	public String toString() {
		return "Paciente [rg=" + rg + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
}
