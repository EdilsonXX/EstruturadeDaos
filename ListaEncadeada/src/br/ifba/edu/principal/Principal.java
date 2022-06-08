package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();
		
		lista.adicionarNoComeco("Igor");
		lista.adicionarNoComeco("Maria");
		lista.adicionarNoComeco("Fulano");
		lista.adicionarNoComeco("Sicrano");
		lista.adicionarNoComeco("Beltrano");
		lista.adicionarNoComeco("José");
		lista.adicionarNoComeco("Camila");
		lista.adicionarNoComeco("Helena");
		
		System.out.println(lista.toString());
		

		lista.adicionarNoFinal("Igor");
		lista.adicionarNoFinal("Maria");
		lista.adicionarNoFinal("Fulano");
		lista.adicionarNoFinal("Sicrano");
		lista.adicionarNoFinal("Beltrano");
		lista.adicionarNoFinal("José");
		lista.adicionarNoFinal("Camila");
		lista.adicionarNoFinal("Helena");
		
		System.out.println(lista.toString());
		
		lista.adicionarPorPosicao("Corno", 50);
		
		System.out.println(lista.toString());
		
	}

}
