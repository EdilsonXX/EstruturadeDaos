package br.ifba.edu.basico;

public class Funcionario {

	private String nome;
	private int rg;
	private int idade;
	
	public Funcionario(String nome, int rg, int idade) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", idade=" + idade + "]";
	}

	
	
}

