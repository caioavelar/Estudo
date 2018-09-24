package acao;

import java.util.Scanner;

public class CPF {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] n= new int[11];
		for(int i=0;i<11;i++){
			do{
			System.out.println("Digite o "+(i+1)+"º dígito:");
			n[i]=in.nextInt();
			}while(n[i]>9||n[i]<0);
		}
		int v[] = new int[12];
		boolean r;
		int s = 0,j=10;
		for (int i = 0; i < 10; i++) {
			if(j>=2){
				System.out.println("Operação:"+n[i]+"*"+j);
			
				v[i] = n[i] * j;
				s += v[i];
				j--;}
				
		}
		int da;
		if (s % 11 < 2) {
			da = 0;
		} else {
			da = 11 - (s % 11);
		}	
		System.out.println("Dígito A:"+da);

		v[9] = da;
		s = 0;
		j=11;
		System.out.println("SEPRA");
		for (int i = 0; i < 12; i++) {
			if(j>=2){
				System.out.println("Operação:"+n[i]+"*"+j);
				v[i] = n[i] * j;
				s += v[i];
				j--;
				}		
		}
		int db;
		if (s % 11 < 2) {
			db = 0;
		} else {
			db = 11 - (s % 11);
		}

		v[10] = db;
		System.out.println("Dígito B:"+db);
		if(n[9]==da){
			if(n[10]==db){
				System.out.println("O CPF é válido");
			}else{
				System.out.println("O CPF é inválido");
			}
		}else{
		System.out.println("O CPF é inválido");
	}
	}
}
