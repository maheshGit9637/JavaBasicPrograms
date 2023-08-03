package InterviewPrepJuly;

public class CheckIfArrayIsSorted {
	
	public static boolean isArraySorted(int[] ar){
	 
		int i;
		for(i=1;i<ar.length;i++) {
			if(ar[i]<ar[i-1]) {
				return false;
			}  
		}
		return true;
		
	}

	public static void main(String[] args) {
		 int [] sortedArray= {1,2,3,4,5,6};
		 int [] unsortedArray= {2,4,1,5,3,400,200};
		 
		 System.out.println(isArraySorted(sortedArray));
		 System.out.println(isArraySorted(unsortedArray));
	}

}
