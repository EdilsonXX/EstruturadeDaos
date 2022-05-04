package aula;

import java.util.ArrayList;

public class CadrastarConta {

	 ArrayList<Conta> contas = new ArrayList<Conta>();
	
	 public void adicionarConta(Conta ca) {
		 
		 contas.add(ca);
		 
	 }
	 
	 public void listarConta () {
		 
		 contas.forEach(System.out::println);
		 
	 }
	 
	 public void removerContaPorPosicao(int x) {
		 
		 contas.remove(x);
		 
	 }
	 
	 public void adicionarContaPoPosicao (int x, Conta c) {
		 
		 contas.set(x, c);
		 
	 }
	 
	 public void removerConta(String x) {
		 
		for (int i = 0; i < contas.size(); i++) {
			
			 if (contas.get(i).getNome().equals(x)) {
				 
				 contas.remove(i);
				 break; 
			 }
			
		}
		 
	 }
	 
}
