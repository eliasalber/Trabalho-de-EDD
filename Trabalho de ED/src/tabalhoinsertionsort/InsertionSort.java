package tabalhoinsertionsort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
			int []v = {5,4,3,100,5,7,9,1,5,5,65,65,98,9,98,56,589,86,5,989,5,89,85,65,9,898,5659,85,6598,5989,85658,8,9,85,689,89};
			nsertionSort(v);
			System.out.println("InsertSort---" + Arrays.toString(v));
		
		System.out.println("o metodo executou em " + (System.currentTimeMillis()- tempoInicial)+ " Segundos");
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
