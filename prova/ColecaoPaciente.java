package prova;

import banco.Conta;

public class ColecaoPaciente {

	Paciente vetor[] = new Paciente[5];
	int aux = 0;
	
	public void cadastrarPaciente (Paciente po) {
		
		if (this.vetor.length == this.aux ) {
			
			aumentarVetor();
			
		}
		
		vetor[aux] = po;
		
		aux++;
		
	}
	
	public void listarpaciente () {
		
		System.out.println("A lista de Pacientes é: ");
		
		for (int i3 = 0; i3 < aux; i3++) {
			
			System.out.println("A Paciente na posicao " +i3+ " tem nome de " +vetor[i3].getNome()+ " , idade de " +vetor[i3].getIdade()+ " e rg de " +vetor[i3].getRg());
			
		}
		
	}
	
	public void cadastrarPacientePorPosicao (Paciente p1, int posicao) {
		
		
		if (this.vetor.length == this.aux ) {
			
			aumentarVetor();
			
		}
		
		for (int cont = aux - 1; cont >= posicao; cont--) {
			
			vetor[cont + 1] = vetor[cont];
			
		}
		
		vetor[posicao] = p1;
		
		this.aux++;
		
	}
	
	public void procurarPacientePorNome (String u) {
		
		for (int i2 = 0; i2 < vetor.length; i2++) {
			
			if (vetor[i2].getNome().equals(u)) {
				
				System.out.println("O Paciente está na posicao " +i2+ " tem nome de " +vetor[i2].getNome()+ " , idade de " +vetor[i2].getIdade()+ " e rg de " +vetor[i2].getRg());
				break;
			}
			
		}
		
	}

	public void procurarPacientePorPosicao (int i) {
		
		System.out.println("O Paciente está na posicao " +i+ " tem nome de " +vetor[i].getNome()+ " , idade de " +vetor[i].getIdade()+ " e rg de " +vetor[i].getRg());
		
	}
	
	public void removerPacientePorPosicao (int r) {
		
		if (this.vetor.length == this.aux ) {
			
			aumentarVetor();
			
		}
		
		for (int cont = r; cont < this.aux; cont++) {
				
			this.vetor[cont] = this.vetor[cont+1]; 
			
		}
		
		this.vetor[this.aux - 1] = null;
		this.aux--;
	}
	
	public void listarpaciente2 () {
		
		
			System.out.println("A lista tem esse numero de paciente: " +aux);
			
	}
	
	public void aumentarVetor() {
		
		Paciente newVetor[] = new Paciente[this.vetor.length+1];
		
		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);
		
		this.vetor = newVetor;
		
	}
	
	
}
