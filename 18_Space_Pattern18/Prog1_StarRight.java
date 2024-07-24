import java.util.*;
class Prog1_StarRight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Row=");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++){
			for(int sp = 1; sp <= row - i; sp++){
				System.out.print("\t");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
	}
}
