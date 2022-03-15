package controller;

public class ThreadVetor extends Thread{

	private int valor;
	private int vetor[] = new int [1000];
	private int i;
	
	
	public ThreadVetor(int valor, int vetor[], int t) {
		this.valor = valor;
		this.vetor = vetor;
		this.i = t;
	}
	@Override
	public void run() {
		Calc();
	}
	
	private void Calc() {
		switch(i) {
		
		case 0 :
			valor = 2;
			double tempoInicial = System.nanoTime();
			if(valor % 2 == 0) {
				for (int t = 0 ; t < vetor.length; t++) {
				}
			}
			double tempoFinal = System.nanoTime(); 
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10,9);
			System.out.println("O tempo foi de " + tempoTotal+ "s");	
		break;
		
		case 1: 
			valor = 1;
			double tempoInicial1 = System.nanoTime();
			if(valor % 2 != 0) {
				for (int i : vetor) {
				}
			}
			double tempoFinal1 = System.nanoTime(); 
			double tempoTotal1 = tempoFinal1 - tempoInicial1;
			tempoTotal = tempoTotal1 / Math.pow(10,9);
			System.out.println("O tempo foi de " + tempoTotal+ "s");	
		break;

				
			}
		}
	}
