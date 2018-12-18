package tabalhoinsertionsort;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class InsertinSorttest {
	public static void main(String[] args) {

		  int i,j;
		  String S;
		  String[]v= {"na","aC","Af","Ac","Ef"};
		  
	  for (j = 1; j < v.length; j++) { 
		    S = v[j];
		    i = j - 1;
	    while (i >= 0) {
		      if (S.toLowerCase().compareTo(v[i].toLowerCase()) > 0) {
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
