package While;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n,soma=0,media, i=0;
		
		while ( i <= 3) {
			i++;
			
			System.out.println("Informe um  numero  ");
			n = ler.nextDouble();
			soma = soma+n;
				}
		    media = soma/4;	
		    
		    System.out.println("A soma é: " + soma + " e a media "+media);
		     ler.close();
	}
}
