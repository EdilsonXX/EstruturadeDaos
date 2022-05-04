package aula;

public class Conta {

	private String nome;
    private float valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Conta(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public Conta() {
		super();
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
    
    
	
}
