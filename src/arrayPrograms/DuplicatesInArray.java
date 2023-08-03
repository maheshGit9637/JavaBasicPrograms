package arrayPrograms;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,4,5,3,1};
		
		int n=999;
		
		for (int i=0;i<a.length;i++) {
			int count=1;
			if(a[i]!=999) {
				
				for(int j=(i+1);j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						a[j]=999;
					}
				}
				
				
			}
			if(count>1) {
				System.out.println(a[i]+" is duplicate in the given array, it is duplicated for "+count);
			}
		}
		
		int[] b= {1,3,1,3,4,4};
		
		int count=0;
		for (int i=0;i<b.length;i++) {
			if(b[i]!=999) {
				boolean flag=false;
				for(int j=(i+1);j<b.length;j++) {
					if(b[i]==b[j]) {
						flag=true;
						b[j]=999;
					}
				}
				
				if(flag) {
					count++;
				}
			}
			 
		}System.out.println(count);
		
		
		
	}

}
