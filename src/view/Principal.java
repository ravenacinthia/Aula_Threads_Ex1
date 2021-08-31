package view;

import java.util.Random;
import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {

		Random random = new Random();
		int[] vetor = new int[1001];

		for (int i = 0; i < vetor.length; i++){
			vetor[i] = 1 + random.nextInt(100);
			//System.out.println(vetor[i]);
		}

		for (int num = 1; num <= 2; num++){
			ThreadVetor tVetor = new ThreadVetor(num, vetor);
			tVetor.start();
		}
	}

}

