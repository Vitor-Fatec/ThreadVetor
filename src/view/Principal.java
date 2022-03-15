package view;
import javax.swing.JOptionPane;

import controller.ThreadVetor;
public class Principal {

	public static void main(String[] args) {
	int valor;
	int vetor[] = new int[1000];
	
	valor = 0;
	
	for(int i = 0; i < 1000; i ++) {
		vetor[i] = (int) (Math.random() * 101);
	}
	
	for(int t = 0; t < 2; t++) {
		Thread vet = new ThreadVetor(valor, vetor, t);
		vet.start();
	}

	}

}
