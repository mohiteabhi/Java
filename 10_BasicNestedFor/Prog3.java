import java.util.*;
class Prog3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Number of rows = " + row);
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= row; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
