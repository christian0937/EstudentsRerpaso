package dto;

import java.util.Random;

public class rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random numeroAleatorio = new Random();
		int max ;
		int min = 7;
		int eAleatoria;
		
		eAleatoria = numeroAleatorio.nextInt(4);
		max = eAleatoria + min;
		System.out.print(max);
		
		
	}

}
