package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basico.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;
	private int totalElementos = 0;
	
	public void adicionarNoComeco (Object obj) {
		
		Celula nova = new Celula(this.cabeca,obj);
		this.cabeca = nova;
		
		if (totalElementos == 0) {
			
			this.cauda = nova;
			
		}
		
		this.totalElementos++;
		
	}
	
	public String toString() {
		
		if (this.totalElementos == 0) {
			
			return "[]";
			
		}
		
		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;
		
		for (int i = 0; i < this.totalElementos - 1; i++) {
			
			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
			
		}
		
		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");
		
		
		return listaencadeada.toString();
	}

	public void adicionarNoFinal (Object obj) {
		
		if (this.totalElementos == 0) {

			this.adicionarNoComeco(obj);
		} 
		
		
		else {

			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;

		}
	}
	
	
	public boolean verificarPosicao (int posicao) {
		
		return posicao >= 0 && posicao < this.totalElementos;
		
	}
	
	public void adicionarPorPosicao (Object obj, int posicao) {
		
		Celula aux = this.cabeca;
		
	if (posicao == 0) {
			
			this.adicionarNoComeco(obj);
			
		} else if (posicao == this.totalElementos) {
			
			this.adicionarNoFinal(obj);
			
		} else {
			
			if (!this.verificarPosicao(posicao)) {
			
				JOptionPane.showMessageDialog(null, "Posicao inválida", null, JOptionPane.ERROR_MESSAGE);
				throw new IllegalArgumentException("A posição digitada é invalida");
			}
		}
			
			for (int i = 0; i < posicao - 1; i++) {
			
				aux = aux.getProxima();
				
		}
			Celula nova = new Celula(obj);
			nova.setProxima(aux.getProxima());
			aux.setProxima(nova);
			
	}
	
}
