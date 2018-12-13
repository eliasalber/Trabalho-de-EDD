package tabalhoinsertionsort;

import java.util.Arrays;

public class InsertinSorttest {
	public static void main(String[] args) {
		  int i,j;
		  String S;
		  String[]v= {"Aa","Ac","Af","An","Az","Aj","Bc","Bd","Ba"};
		  System.out.println(Arrays.toString(v));
		  
		  for (j = 1; j < v.length; j++) { 
		    S = v[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (S.compareTo(v[i]) > 0) {
		        break;
		      }
		      v[i + 1] = v[i];
		      i--;
		   }
		    v[i + 1] = S;
		    System.out.println(Arrays.toString(v));
		  }
		  System.out.println("InsertSort---" +Arrays.toString(v));
	}
}
