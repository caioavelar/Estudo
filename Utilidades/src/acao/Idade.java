package acao;

import java.util.Calendar;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c,d,m,a;
		Calendar x = Calendar.getInstance();
		
		int datual=x.get(Calendar.DAY_OF_MONTH);
		int matual=x.get(Calendar.MONTH);//Nota: O java considera Janeiro o m�s 0.
		int aatual=x.get(Calendar.YEAR);
		
		System.out.println(matual);
		
		System.out.println("Escreva seu dia de nascimento:");	
		d= in.nextInt();
		
		in = new Scanner(System.in);
		
		do{
			System.out.println("Escreva o n�mero que representa seu m�s de nascimento:");
			m= in.nextInt();
		}
		while(m<1||m>12);
		
		in = new Scanner(System.in);
		
			do{
				System.out.println("Escreva o seu ano de nascimento:");
				a=in.nextInt();
			}
			while(a>aatual);
		System.out.println(x.getTime());
			//In�cio das compara��es
		if(matual>(m-1)){
			System.out.println("Voc� j� fez anivers�rio.Sua idade �: "+(aatual-a));
		}
		
		if(matual<(m-1)){
			System.out.println("Voc� n�o fez anivers�rio.Sua idade �: "+((aatual-1)-a));	
		}
		
		if(matual==(m-1)){
				if (datual>=d){
					System.out.println("Seu anivers�rio passou.Sua idade �: "+(aatual-a));
				}
				else if (datual<d){
					System.out.println("Seu anivers�rio est� chegando! Sua idade �: "+((aatual-1)-a));
			}			
		}
		
		
		}

	private static void zezinho() {
		// TODO Auto-generated method stub
		
	}

}
