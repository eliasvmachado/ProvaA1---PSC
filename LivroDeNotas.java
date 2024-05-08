package primeiraProva;

import java.util.Scanner;

class LivroDeNotas{
	
	Scanner scanner = new Scanner(System.in);
	private int numAlunos;
	private double[] medias;
	

	public int getNumAlunos() {
		return numAlunos;
	}
	
	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
		this.medias =  new double[numAlunos];
	}
	
	public void calcularMediaDeCadaAluno (){
		do {
			System.out.println("\nDigite a quantidade de alunos: ");
			numAlunos = scanner.nextInt();
			
			if(numAlunos <= 0) {
				System.out.println("Digite um número de alunos válido.");
			}
		} while(numAlunos <= 0);
		
		medias = new double[numAlunos];
		
		for(int i = 0; i < numAlunos; i++) {
			System.out.println("Digite a nota da A1 para o aluno " + (i+1) + ": ");
			double a1 = scanner.nextDouble();
			System.out.println("Digite a nota da A2 para o aluno " + (i+1) + ": ");
			double a2 = scanner.nextDouble();
			System.out.println("Digite a nota da A3 para o aluno " + (i+1) + ": ");
			double a3 = scanner.nextDouble();
			
			double media = (a1 + a2 + a3) / 3;
			
			medias[i] = media;
			
			System.out.println("A média do aluno " + (i+1) + " foi: " + medias[i]);	
		}
		
		scanner.close(); 
	}
	
	public void calcularMediaDaTurma(){
		double soma = 0;
		for(double media : medias) {
			soma = soma + media;
		}
		
		double mediaGeral = soma / numAlunos;
		System.out.println("A media geral da turma foi: " + mediaGeral);
	}
	
	public static void main(String[] args) {
		LivroDeNotas livro = new LivroDeNotas();
		
		livro.calcularMediaDeCadaAluno();
		livro.calcularMediaDaTurma();
		
	}
	
	//fechei o scanner dentro do método :)
}