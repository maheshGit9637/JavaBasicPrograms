package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReadArray {

	public static void main(String[] args) {


		int[] a= {1,2,3,4,5,6,7};
		System.out.println("get array element using array index");
		System.out.println("print first element : array[index] array[0] "+a[0]);
		System.out.println("print last element : array[index] array[array.length-1] "+a[a.length-1]);
		
		System.out.println();
		System.out.println("print all array element using for loop ");
		
		for (int i=0;i<a.length;i++) {
			System.out.println("array at element "+i+" "+a[i]);
		}
		
		System.out.println();
		System.out.println("print all array element using for each loop ");
		int count=0;
		for (int i:a) {
			System.out.println("array at element "+count+" "+i);
			count++;
		}
		
		System.out.println();
		System.out.println("print all array element using Arrays.stream(array_object) with forEach ");
		//check forEach loop in javascript
		
		Arrays.stream(a).forEach(num ->{
			System.out.println("array at element "+" "+num); 
		});
		
		System.out.println();
		System.out.println("print all array element using iterator ");
		//check forEach loop in javascript
		
		   

	        // Convert the int array to a List of Integers using Arrays.asList()
		  List<Integer> integerList = new ArrayList<>();
		  //add array elements to list
		  
		  for (int i=0;i<a.length;i++) {
			  integerList.add(a[i]);
		  }
		   
		  Iterator <Integer> it=integerList.iterator();
		  int i=0;
		  while(it.hasNext()) {
			  System.out.println("array element at "+i+" "+it.next());
			  i++;
		  }
			

	}

	 

}
