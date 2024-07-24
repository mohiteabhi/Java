import java.util.*;
class Prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows = ");
		int rows = sc.nextInt();

		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int sp = 1; sp <= rows - i; sp++){
				System.out.print("\t");
			}
			;
			for(int j = 1; j <= i; j++){
				System.out.print(temp-- + "\t");
			}
			System.out.println();
		}
	}
}
/*
 *     3
 *   3 2
 * 3 2 1
 */  
