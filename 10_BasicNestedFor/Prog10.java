import java.util.*;
class Prog10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Number of rows: " + row);
		for(int i = 1; i <= row; i++){
			int num = i;
			for(int j = 1; j <= row; j++){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
/*
1 2 3
2 3 4
3 4 5
*/
