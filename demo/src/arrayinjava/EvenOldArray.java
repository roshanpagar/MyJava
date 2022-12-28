package arrayinjava;

public class EvenOldArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			int arr[]={1,2,3,4,5,6};
			int oddSum=0,evenSum=0;
			for(int i=0; i<6; i++){
			if(arr[i]%2==0){
			evenSum=evenSum+arr[i];
			}
			else{
			oddSum=oddSum+arr[i];
			}

			}
			System.out.println("\nSum of even is: "+evenSum);
			System.out.println("\nSum of odd is: "+oddSum);
		
             
	     if (evenSum >=oddSum )
	     {
	    	 System.out.println("Gretest no is: "+evenSum);
	     }
	     else 
	     {
	    	 System.out.println("Gretest no is: "+oddSum);
	     }
	    
	         
	}
	}


