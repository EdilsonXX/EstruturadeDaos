package aula;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner imput = new Scanner(System.in);
		CadrastarConta ca = new CadrastarConta();
		Conta cc = new Conta();
		int posicao;
		
		for (int i = 0; i < 5; i++) {
			Conta co = new Conta();
			System.out.println("Digite o nome da Conta: ");
			co.setNome(imput.next());
			System.out.println("Digite o valor da Conta: ");
			co.setValor(imput.nextFloat());
			ca.adicionarConta(co);
			
		}
		
		ca.listarConta();
		
		System.out.println("Digite a nova conta que você quer colocar: ");
		cc.setNome(imput.next());
		System.out.println("Digite o valor da nova conta: ");
		cc.setValor(imput.nextFloat());
		System.out.println("Digite a posicão da nova conta ");
		posicao = imput.nextInt();
		
		ca.adicionarContaPoPosicao(posicao, cc);
		
		ca.listarConta();
		
		System.out.println("Digite a posicão da conta que você quer remover: ");
		int l = imput.nextInt();
		
		ca.removerContaPorPosicao(l);
		
		ca.listarConta();
		
		System.out.println("Digite o nome da conta que você quer remover: ");
		String a = imput.next();
		
		ca.removerConta(a);
		
		ca.listarConta();
		
	}

}
