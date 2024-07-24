import java.util.*;
class Prog7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Number of rows = " + row);
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= row; j++){
				System.out.print((j) + ("") +(char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}
/*
 1A 2B 3C
 1A 2B 3C
 1A 2B 3C
 */
