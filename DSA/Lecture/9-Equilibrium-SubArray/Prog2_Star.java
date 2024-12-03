// public class Prog2_Star {
    
//     public static void main(String[] args) {
//         int itr = 0;
//         for(int i = 0; i < 3; i++){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*\t");
//                 itr++;
//             }
//             System.out.println();
//         }
//         System.out.println(itr);
//     }
// }


// public class Prog2_Star{
    
//     public static void main(String[] args) {
//         int itr = 0;
//         for (int i = 1; i <= 3; i++) {
//             if (i == 1) {
//                 System.out.println("*");
//             }
//             else if (i > 1) {
//                 for (int j = 1; j <= i; j++) {
//                     itr++;
//                     System.out.print("*\t");
//                 }
//                 System.out.println();
//             }
//         }
//         System.out.println(itr);
//     }
// }

public class Prog2_Star {

    public static void main(String[] args) {
        int itr = 0;
        for (int i = 0; i < 3; i++) {
            // Using if-else to handle the number of stars in each row
            System.out.print("*\t");

            if (i >= 1) {
                System.out.print("*\t");

            }
            
            if (i == 2) {
                System.out.print("*\t");

            }
            
            System.out.println();
        }
        System.out.println(itr);
    }
}

