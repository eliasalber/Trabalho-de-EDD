package insertionsort;

public class Classteste {
	public static void insertionSort(int[] array) 
    {
           for (int i = 0; i < array.length; i++) 
           {
                   int a = array[i];
                   for (int j = i - 1; j >= 0 && array[j] > a; j--)
                   {
                           array[j + 1] = array[j];
                           array[j] = a;
                   }                       
           }               
   }

}
