package quicsort;

import java.util.Arrays;

public class Main { 
	 public static void main(String[] args) {
		 // Your algorithm goes here. 
		 int[] data = {12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77}; 
		 System.out.println("Unsorted Array \n"); 
		 System.out.println(Arrays.toString(data) +"\n"); 

   int size = data.length; 

   // call quicksort() on array data 
   Quicksort.quickSort(data, 0, size - 1);
   
   System.out.println("Sorted Array in Ascending Order: \n"); 
   System.out.println(Arrays.toString(data)+"\n"); 
   System.out.println("Sorting was completed in: " ); 
   Quicksort.display(); // this line will print the number of steps
   System.out.println("Steps!"); 

   } 
}
