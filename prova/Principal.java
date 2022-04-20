package prova;

import java.util.Scanner;

import banco.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner imput = new Scanner(System.in);
		int posicao;
		ColecaoPaciente co = new ColecaoPaciente();
		int a = 1;
		
		for (int i = 0; i < 5; i++) {
			Paciente pa = new Paciente();
			System.out.println("Digite o nome do paciente: ");
			pa.setNome(imput.next());
			System.out.println("Digite o rg do paciente: ");
			pa.setRg(imput.next());
			System.out.println("Digite a idade do paciente: ");
			pa.setIdade(imput.nextInt());
			
			co.cadastrarPaciente(pa);
		
		}

		co.listarpaciente();
		
		for (int i = 0; a != 0; i++) {
			
			Paciente po = new Paciente();
			System.out.println("Digite o nome do paciente: ");
			po.setNome(imput.next());
			System.out.println("Digite o rg do paciente: ");
			po.setRg(imput.next());
			System.out.println("Digite a idade do paciente: ");
			po.setIdade(imput.nextInt());
			System.out.println("Digite da posicao que você quer botar esse paciente: ");
			posicao = imput.nextInt();
			System.out.println("Você quer continuar a adicionar pacientes? Digite 1 para sim e Digite 0 para não: ");
			a = imput.nextInt();
			co.cadastrarPacientePorPosicao(po, posicao);
		}
		
		co.listarpaciente();
		
		System.out.println("Digite o nome do paciente que você quer procurar: ");
		String x = imput.next();
		co.procurarPacientePorNome(x);
		
		System.out.println("Digite a posicão do paciente que você quer procurar: ");
		int z = imput.nextInt();
		co.procurarPacientePorPosicao(z);
		
		System.out.println("Digite a posicão do paciente que você quer remover: ");
		int l = imput.nextInt();
		
		co.removerPacientePorPosicao(l);
		
		co.listarpaciente();
		co.listarpaciente2();
		
	}

	
	
}
