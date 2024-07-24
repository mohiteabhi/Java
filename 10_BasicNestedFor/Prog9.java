import java.util.*;
class Prog9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int num = 1;
		System.out.println("Number of rows = " + row);
		for(int i = 1; i <= row; i++){

			for(int j = 1; j <= row; j++){
				System.out.print(num++ + " ");
			}
			num--;
			System.out.println();
		}
	}
}
/*
 * 1  2  3  4
 * 4  5  6  7
 * 7  8  9  10
 * 10 11 12 13
 * */
