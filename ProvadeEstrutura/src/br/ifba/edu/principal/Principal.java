package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.basico.Funcionario;
import br.ifba.edu.listasimples.ListaSimples;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ListaSimples l = new ListaSimples();
		Funcionario f2 = new Funcionario ();
		Funcionario f3 = new Funcionario ();
		Scanner input = new Scanner(System.in);
		
		for (float i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			System.out.println("Digite o nome do funcionario: ");
			f.setNome(input.next());
			System.out.println("Digite o rg do funcionario: ");
			f.setRg(input.nextInt());
			System.out.println("Digite a idade do funcionario: ");
			f.setIdade(input.nextInt());
			l.adicionarNoInicio(f);
		}
		
		System.out.println(l.toString());
		
		System.out.println("Digite o nome do funcionario: ");
		f2.setNome(input.next());
		System.out.println("Digite o rg do funcionario: ");
		f2.setRg(input.nextInt());
		System.out.println("Digite a idade do funcionario: ");
		f2.setIdade(input.nextInt());
		
		l.adicionarNoFim(f2);
		
		System.out.println(l.toString());
		
		System.out.println("Digite o nome do funcionario: ");
		f3.setNome(input.next());
		System.out.println("Digite o rg do funcionario: ");
		f3.setRg(input.nextInt());
		System.out.println("Digite a idade do funcionario: ");
		f3.setIdade(input.nextInt());
		System.out.println("Digite a posicao que voce quer colocar o funcionaro: ");
		int x = input.nextInt();
		
		l.adicionarPorPosicao(f3, x);
		
		System.out.println(l.toString());
		
		l.removerDoInicio();
		
		System.out.println(l.toString());
		
		l.removerDoFim();
		
		System.out.println(l.toString());
		
		System.out.println("Digite a posicao que voce quer remover: ");
		int y = input.nextInt();
		
		l.removerPorPosicao(y);
		
		System.out.println(l.toString());
		
	}
	
}
