public class Prog3_EquilibriumIndexOptimized {

	public static int EQIFinder(int[] arr){
		int totalSum = 0;
      	        int leftSum = 0;
       	        int ans = -1;

        	for(int i = 0; i < arr.length; i++){
            		totalSum += arr[i]; 
        	}

        	for(int j = 0; j < arr.length; j++){
            		totalSum = totalSum - arr[j];
            		if (leftSum == totalSum) {
                		ans = j;
                		break;
            		}
            			leftSum += arr[j];
        	}	

        	if(ans != -1){
            		return ans;
        	}
        	else{
            		return -1;
        	}
	}
	public static void main(String[] args){
		int arr[] = {2, 1, 1};
		int result = EQIFinder(arr);
		System.out.println(result);
	}
}

/*
    public static void main(String[] args) {

        int arr[] = {2,1,-1};
        int tota`lSum = 0;
        int leftSum = 0;
        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i]; 
        }

        for(int j = 0; j < arr.length; j++){
            totalSum = totalSum - arr[j];
            if (leftSum == totalSum) {
                ans = j;
                break;
            }
            leftSum += arr[j];
        }

        if(ans != -1){
            System.out.println(ans);
        }
        else{
            System.out.println("No EqIndex");
        }
     
    
    }
    
    
}*/


