public class Prog2_Rightmax {
    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
    //int[] rightMax={0, 0, 0, 0, 0, 0, 0,  0, 0, 1} 
        int N = arr.length;
        int[] rightMax = new int[N];
        rightMax[N-1] = arr[N-1];
        int itr = 0;

        for (int i = 1; i < arr.length; i++) {
            if (rightMax[N-i] < arr[N-i-1]) {
                rightMax[N-i-1] = arr[N-i-1];
            }
            else{
                rightMax[N-i-1] = rightMax[N-i];
            }
            itr++;
        }
        System.out.println(itr);
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + ", ");
        }
    }
}
