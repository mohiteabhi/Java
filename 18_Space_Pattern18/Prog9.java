import java.util.*;
class Prog9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows=");
		int rows = sc.nextInt();

		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp < i; sp++){
				System.out.print("\t");
			}
			for(int j = rows; j >= i; j--){
				System.out.print((char)(64 + j) + "\t");
			}
			System.out.println();
		}
	}
}
