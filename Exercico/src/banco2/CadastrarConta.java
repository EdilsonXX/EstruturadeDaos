package banco2;

public class CadastrarConta {

	Conta vetor[] = new Conta[5];
	int aux = 0;
	
	public void adicionarConta (Conta c) {
		
		if (this.vetor.length == this.aux ) {
			
			aumentarVetor();
			
		}
		
		vetor[aux] = c;
		
		aux++;
	}
	
	public void procurarConta (String u) {
		
		for (int i2 = 0; i2 < vetor.length; i2++) {
			
			if (vetor[i2].getNome().equals(u)) {
				
				System.out.println("A Conta que você estar procurando é de número " +i2+ " , valor de " +vetor[i2].getValor()+ " e nomeada de " +vetor[i2].getNome());
				break;
			}
			
		}
		
		
	}
	
	public void listarConta () {
		
		System.out.println("A lista de Contas é: ");
		
		for (int i3 = 0; i3 < vetor.length; i3++) {
			
			System.out.println("A Conta de número " +i3+ " tem valor de " +vetor[i3].getValor()+ " e nome de " +vetor[i3].getNome());
			
		}
		
	}
	
	
	public void inserirConta (Conta c1, int posicao) {
		
		
		if (this.vetor.length == this.aux ) {
			
			aumentarVetor();
			
		}
		
		for (int cont = aux - 1; cont >= posicao; cont--) {
			
			vetor[cont + 1] = vetor[cont];
			
		}
		
		vetor[posicao] = c1;
		
		this.aux++;
		
		for (int i4 = 0; i4 < this.aux - 1; i4++) {
			
			System.out.println("A Conta de número " +i4+ " tem valor de " +vetor[i4].getValor()+ " e nome de " +vetor[i4].getNome());
			
		}
		
	}
	
	public void aumentarVetor() {
		
		Conta newVetor[] = new Conta[this.vetor.length+10];
		
		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);
		
		this.vetor = newVetor;
		
	}
	
}
