package br.ifba.edu.listasimples;

import javax.swing.JOptionPane;

import br.ifba.edu.basico.Celula;

public class ListaSimples {

	private Celula cabeca;
	private Celula cauda;
	private int totalElementos = 0;
	
	public void adicionarNoInicio (Object obj) {
		
		Celula nova = new Celula(this.cabeca,obj);
		this.cabeca = nova;
		
		if (totalElementos == 0) {
			
			this.cauda = nova;
			
		}
		
		this.totalElementos++;
		
	}
	
	public void adicionarNoFim (Object obj) {
		
		if (this.totalElementos == 0) {

			this.adicionarNoInicio(obj);
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
	
	public void adicionarPorPosicao (Object obj, int posicao) {
		
		Celula aux = this.cabeca;
		
		if (posicao == 0) {
			
			this.adicionarNoInicio(obj);
			
		} else if (posicao == this.totalElementos) {
			
			this.adicionarNoFim(obj);
			
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
	
	public void removerDoInicio () {
		
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);

		this.totalElementos--;
	
	}
	
	public void removerDoFim () {
		
		Celula aux = this.cabeca;
		Celula ant = this.cauda;
		while (aux.getProxima() != null) {
			
			ant = aux;
			aux = aux.getProxima();
			
		}
		ant.setProxima(null);
		this.cauda = ant;
		this.totalElementos--;
		
	}
	
	public void removerPorPosicao (int posicao) {
		
		Celula aux = this.cabeca;
	
		for (int cont = 0; cont < posicao - 1; cont++) {
			
			aux = aux.getProxima();	
		}
		
		aux.setProxima(aux.getProxima().getProxima());
		this.totalElementos--;
		
	}
}
