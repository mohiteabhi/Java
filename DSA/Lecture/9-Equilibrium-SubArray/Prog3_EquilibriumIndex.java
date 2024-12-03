/*
 * You are given an array A of size N
 * 
 * Your task is to find the equilibrium index of given array
 * The equilibrium index of an array is an index such that sum of elements at lower indexes is equal t sum of elements at higher index
 * 
 * If there are no elements that are lower indexes or at higher indexes then the corresponding sum of elements is considered as 0.
 * 
 * 
 */

public class Prog3_EquilibriumIndex {

    static int equilibriumIndex(int[] arr) {
        int retValue = 0;
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                flg = 1;
                retValue = i;
                break;
            }
        }
        if (flg > 0) {
            return retValue;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int op = equilibriumIndex(arr);
        System.out.println(op);
    }
}
