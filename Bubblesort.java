package tutorialworkshop_03;

public class Bubblesort {

	public static void main(String[] args) {
		        int arr[] = {5,4,3,10,1};
		        int i,j;
		        
		        int length = arr.length;
		        for(i=0; i<length; i++) {
		            for(j=1; j<length-i;j++) {
		                if(arr[j-1]>arr[j]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j-1];
		                    arr[j-1]=temp;
		                    
		                    System.out.print(arr[temp]+" ");
		                }
		            }
		             
		        
		            
		        
		        }


	}

}
