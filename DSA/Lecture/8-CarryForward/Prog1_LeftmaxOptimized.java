class Prog1_LeftmaxOptimized {
    // public static void main(String[] args) {
    //     int[] arr = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
    //     int N = arr.length;
    //     int max = Integer.MIN_VALUE;
    //     int leftMax[] = new int[N];
    //     int itr = 0;

    //     for(int i = 0; i < N; i++){
    //         itr++;
    //         if(arr[i] > max){
    //             max = arr[i];
    //             leftMax[i] = max;
    //         }
    //         else{
    //             leftMax[i] = max;
    //         }

    //         System.out.println(leftMax[i]);
    //     }

    //     System.out.println(itr);
    // }

    public static void main(String[] args) {
        int[] arr = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int N = arr.length;
        int[] leftMax = new int[N];
        leftMax[0] = arr[0];
        int itr = 0;

        for (int i = 1; i < N; i++) {
            itr++;
            if(leftMax[i-1] < arr[i]){
                leftMax[i] = arr[i];
	    }
            else{
                leftMax[i] = leftMax[i-1];
	    }
            
            
        
        }
	for(int i = 0; i < N; i++){
		System.out.print(leftMax[i]);
	}
        System.out.println("Total itr: " + itr);
    }
    
}
