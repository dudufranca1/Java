package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A_120_Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos: ");
		int qntdAlunos = sc.nextInt();
		System.out.println("Quantas notas por aluno? ");
		int qntdNotas = sc.nextInt();
		
		// Matriz de duas dimens�es 
		// array mais externo � qntdAlunos, array mais interno qntdNotas
		// porque possuo 2 arrays, qntdNotas dentro de qntdAlunos
		double [] [] notasDaTurma = new double [qntdAlunos][qntdNotas];
		
		double total = 0;
		// executo 1� for externo
		for (int a = 0; a < notasDaTurma.length; a++) {
			// entro no 2� for interno para obter as notas
			for (int n = 0; n < notasDaTurma[a].length; n++) {				
				System.out.printf("Informe a nota %d do aluno %d: \n", n + 1, a + 1);
				notasDaTurma[a][n] = sc.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		double media = total / (qntdAlunos * qntdNotas);
		System.out.printf("M�dia da turma �: %.2f\n",media);
		
		for(double [] notasDosAlunos : notasDaTurma) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}

		sc.close();
	}
}
