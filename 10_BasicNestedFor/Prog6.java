import java.util.*;
class Prog6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Number of rows = " + rows);
		int val = 1;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				System.out.print("1A ");
			}
			System.out.println();
		}
	}
}
/*
1A 1A 1A 1A
1A 1A 1A 1A
1A 1A 1A 1A
1A 1A 1A 1A
*/
