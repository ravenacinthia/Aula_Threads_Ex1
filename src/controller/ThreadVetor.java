package controller;

public class ThreadVetor extends Thread{

	private int num;
	private int vetor[];

	public ThreadVetor(int num, int vetor[]){
		this.num = num;
		this.vetor = vetor;
	}


	@Override
	public void run() {
		calc();
	}

	private void calc() {

		switch (num){
		case 1:
			double tempoInicial = System.nanoTime();
			for (int i : vetor){
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;

			//tempoTotal nano segundos é 10^-9 segundos
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Tempo total para percorrer o vetor ==> " + tempoTotal + "s.");
			break;
			
		case 2:
			double tempoInicial2 = System.nanoTime();
			for (int i = 0 ; i < vetor.length; i++){

			}
			double tempoFinal2 = System.nanoTime();
			double tempoTotal2 = tempoFinal2 - tempoInicial2;

			//tempoTotal nano segundos é 10^-9 segundos
			tempoTotal2 = tempoTotal2 / Math.pow(10, 9);
			System.out.println("Tempo total para percorrer o vetor ==> " + tempoTotal2 + "s.");
			
			break;
		}
		//System.out.println();

	}
}



