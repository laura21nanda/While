package While;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int n, i=0;
			
			System.out.println("Informe um numero final: ");
			n = ler.nextInt();
	
			while (i<=n) {
			i++;
			
			if (i%2!=0) {
				System.out.println(i +  " É impar ");
			}
				else {
				}
				
			ler.close();
				
	}
	}

}
