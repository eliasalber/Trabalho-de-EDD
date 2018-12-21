package tabalhoinsertionsort;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class InsertinSorttest {
	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		  int i,j;
		  String S;
		  String[]v= {"natalia","Eleias","Ana","Eliasa","Fernado","Luis","magu","Lolis","albert","may","lulu","Lusia","Gabriel","felipe","Fabio","erik","Henrique","emo","ZOI"};
		  
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
		  System.out.println("o metodo executou em " + (System.currentTimeMillis()- tempoInicial)+ " Segundos");

	}
}
