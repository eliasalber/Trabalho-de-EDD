package tabalhoinsertionsort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
			int []v = {5,4,3,100,5,7,9,1};
			nsertionSort(v);
			System.out.println("InsertSort---" + Arrays.toString(v));
					
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
