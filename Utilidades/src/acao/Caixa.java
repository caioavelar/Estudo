package acao;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo ao caixa");
		
		Scanner in = new Scanner(System.in);
		int es,q=0,t=0,qt,i;
		String o;
		
		System.out.println("Digite a quantidade de produtos"); //Imprático, porém é o que temos
		es= in.nextInt();
		
		
		String[] pro =  new String[es]; //Definição de Vetor, a quantidade será
		Double[] pre = new Double[es]; // definida pela variável es
		
		
		in = new Scanner(System.in);
		
		for(i=0;i<es;i++){//loop
			in = new Scanner(System.in);
			System.out.println("Digite o nome do produto:");
			pro[i] = in.nextLine();
			
			in = new Scanner(System.in);
			
			System.out.println("Digite o preço");
			pre[i] = in.nextDouble();
			
			in = new Scanner(System.in);
			
			System.out.println("Digite a quantidade de produtos");
			qt=in.nextInt();
			
			t+=pre[i]*qt;
			q+=qt;
			
		}
		System.out.println("Você comprou "+q+" produtos!");
		System.out.println("O total da compra foi: R$"+t);
		
		in = new Scanner(System.in);
		
		System.out.println("Deseja ver o que comprou?");
		o=in.nextLine();
		switch (o) {
		case "sim":
			System.out.print("Produto          Preço");
			for(i=0;i<es;i++){
				System.out.println(pro[i]+"R$"+pre[i]);
				
			}
			break;

		default:
			System.out.println("Então tudo bem...");
			break;
		}
	}

}

	