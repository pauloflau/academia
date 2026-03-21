package com.jmp.academia.util;

public class DiversosUtils {
	public static boolean isEmpty(String s) { //verifica se a string e vazia
		if(s == null) {  //se a string nao for vazia
			return true;
		}
		//se tirar os espacos do inicio e medir o tamanho e igual a 0 ou false
		return s.trim().length() ==0 ; 
	}
	
	public static String preencheZero(int valor , int tamanhoFinal) {
		//preenche com zeros dependendo do valor da string q eu passar
		return String.format("%0" + tamanhoFinal + "d", valor);
	}
		
	/*
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "     ";
		String str3 = "  a   ";
		String str4 = null;
		boolean b = DiversosUtils.isEmpty(str1); //vazia
		boolean c = DiversosUtils.isEmpty(str2); //nao vazia
		boolean d = DiversosUtils.isEmpty(str3); //vazia
		boolean e = DiversosUtils.isEmpty(str4); //nao vazia

		System.out.println(b); 
		System.out.println(c);
		System.out.println(d); 
		System.out.println(e);
		
		int v = 321;  //metodo abaixo vai resultar 00000321
		System.out.println(DiversosUtils.preencheZero(v,8));
	}
	*/
}
