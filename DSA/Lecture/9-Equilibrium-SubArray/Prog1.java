/*

Given an char array, Return the count of pair (i, j), such that:
a) i > j
b) arr[i] = 'a'
   arr[j] = 'g'

Arr: ['a', 'b', 'e', 'g', 'a', 'a']
o/p: 3

*/


class PairCount{
    public static void main(String[] args) {
        char[] ch = new char[]{'a', 'b', 'e', 'g', 'a', 'a'};
        int count = 0;
        int itr = 0;



        // for (int i = 0; i < ch.length; i++) {
        //     for(int j = 0; j < ch.length; j++){
        //         if(i == j){
        //             continue;
        //         }
        //         else if(ch[i] == 'a' && ch[j] == 'g'){
        //             count++;
        //         }
        //         itr++;
        //     }
        // }
        // System.out.println("count: " + count);
        // System.out.println("Itr: " + itr);



        // for (int i = 0; i < ch.length; i++) {
        //     if(ch[i] == 'a'){
        //         for(int j = 0; j < ch.length; j++){
        //             if (i==j) {
        //                 continue;
        //             }
        //             else if(ch[j] == 'g'){
        //                 count++;
        //             }
        //             itr++;
        //         }
        //     }
        // }
        // System.out.println("count: " + count);
        // System.out.println("itr " + itr);
    }
}
