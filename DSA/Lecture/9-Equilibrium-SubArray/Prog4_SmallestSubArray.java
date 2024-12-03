public class Prog4_SmallestSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,3,4,6,4,6,3};
        int minLength = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == minValue) {
                for(int k = j+1; k < arr.length; k++){
                    if(arr[k] == maxValue){
                        length = k - j + 1;
                        if (minLength > length) {
                            minLength = length;
                        }
                    }
                }
            }
            else if (arr[j] == maxValue) {
                for(int k = j+1; k < arr.length; k++){
                    if(arr[k] == minValue){
                        length = j - k + 1;
                        if (minLength > length) {
                            minLength = length;
                        }
                    }
                }
            }
        }
        System.out.println("Subarray with min length between min and max: " + minLength);
    }
}
