package banco2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		CadastrarConta ca = new CadastrarConta();
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
		
		System.out.println("Digite a conta que você quer procurar: ");
		String r = imput.next();
		
		ca.procurarConta(r);
		
		System.out.println("Digite a nova conta que você quer colocar: ");
		cc.setNome(imput.next());
		System.out.println("Digite o valor da nova conta: ");
		cc.setValor(imput.nextFloat());
		System.out.println("Digite a posicão da nova conta ");
		posicao = imput.nextInt();
		
		ca.inserirConta(cc, posicao);
		
	}

}
