package tabalhoinsertionsortteste;

import java.util.Arrays;
import java.util.Scanner;

public class Testedearray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long tempoInicial = System.currentTimeMillis();
		System.out.println();
		int n = input.nextInt();
			int v[] = new int[n];
			nsertionSort(v);
			System.out.println("InsertSort---" + Arrays.toString(v));
		
		System.out.println("o metodo executou em " + (System.currentTimeMillis()- tempoInicial));
	}	
					

	private static void nsertionSort(int[] v) {
		int x,j;
		for (int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			 while ((j >=0 && v[j] > x)) {
				  v[j + 1] = v[j];
				  j = j - 1;
				  System.out.println(Arrays.toString(v));	
			}
			 v[j + 1] = x;
		}
		
	}		
}



