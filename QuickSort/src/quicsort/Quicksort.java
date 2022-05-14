package quicsort; 


class Quicksort {
	static int swap = 0; 
	// partition position 
	static int partition(int array[], int low, int high) { 
		// rightmost element as pivot 
		int pivot = array[high]; 
     
	    // pointer to high
	    int i = (low - 1); 
	 
	    // traverse through all elements 
	     
	    for (int j = low; j < high; j++) { 
	    	if (array[j] <= pivot) { 
	 
	        // Checking if element should move right or left 
	        i++; 
 
        
        int temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp;
        //System.out.print(array[low] +"\t"+ "Was swapped with "+ "\t"+ array[high]+ "\n");
        
        // if you uncomment the code line above, you will be able to see the entire traversing
        swap++; 
        
      } 

    } 
 
    // sorting low to hi 
    int temp = array[i + 1]; 
    array[i + 1] = array[high]; 
    array[high] = temp; 
    System.out.print(array[low] +"\t"+ "Was swapped with "+ "\t"+ array[high]+ "\n");
    return (i + 1); 
  } 
   
  static void display(){ 
	  System.out.println(swap); 
	  } 
  
  static void quickSort(int array[], int low, int high) { 
	  if (low < high) { 
 
       
      int hilow = partition(array, low, high); 
       
      // recursive call on the left of pivot 
      quickSort(array, low, hilow - 1); 
 
      // recursive call on the right of pivot 
      quickSort(array, hilow + 1, high); 
      }
    } 
} 
 
 
