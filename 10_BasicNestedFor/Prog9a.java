import java.util.*;
class Prog9a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Number of rows = " + rows);
		int num = 1;

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				System.out.print((char)(64+rows) + "" + num++ + " ");
			}
			System.out.println();
		}
	}
}
