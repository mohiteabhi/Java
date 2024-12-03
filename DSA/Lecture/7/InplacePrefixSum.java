class InplacePrefixSum{
    public static void main(String[] args){
        int[] arr = {4,3,2};
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i-1];
            arr[i] += temp; 
        }

        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}