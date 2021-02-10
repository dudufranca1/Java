package arrays;

import java.util.Arrays;

public class A_116_Array {
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [4];
		notasAlunoA[0] = 7.6;
		notasAlunoA[1] = 8.2;
		notasAlunoA[2] = 9;
		notasAlunoA[3] = 6.2;
		
		System.out.println(notasAlunoA[0]);
		// Lendo os elementos do array com a classe Arrays
		System.out.println(Arrays.toString(notasAlunoA));
		
		double mediaAlunoA = 0;
		// .length
		for(int i = 0; i < notasAlunoA.length; i++) {
			mediaAlunoA += notasAlunoA[i];
		}
		System.out.println(mediaAlunoA / notasAlunoA.length);
		
		// Array de boolean
		double [] notasAlunoB = { 7.4, 6.5, 8.2, 9 };	
		
		double mediaAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			mediaAlunoB += notasAlunoB[i];
		}
		System.out.println(mediaAlunoB / notasAlunoB.length);
		
	}

}
