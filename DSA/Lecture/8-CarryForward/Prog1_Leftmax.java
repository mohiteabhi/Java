class Leftmax {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };

        int max = Integer.MIN_VALUE;
        int itr = 0; 


        int leftMax[] = new int[arr.length];

        for (int x = 0; x < arr.length; x++) { 


            for (int y = 0; y <= x; y++) { 
                itr++;

                if (max < arr[x]) { 
                    leftMax[y] = arr[x];
                    max = arr[y];
                } else {
                    leftMax[y] = max;
                }
            }

            System.out.print(leftMax[x] + ", ");
        }
        System.out.println("\nitr: " + itr);
    }
}
