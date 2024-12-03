public class Prog1_Optimized {
    
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'e', 'g', 'a', 'a'};
        int pair = 0; //
        int countG = 0; //
        int countA = 0; //
        int itr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                countA++;
            }
            else if (arr[i] == 'g') {
                countG++;
            }
            pair = countA * countG;
            itr++;
        }


        System.out.println("Count: " + pair);
        System.out.println("Itr: " + itr);
    }
}
