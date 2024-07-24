import java.util.*;
class Prog8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows=");
		int rows = sc.nextInt();

		for(int i = 1; i <=rows; i++){
			int temp = i;
			for(int sp = 1; sp < i; sp++){
				System.out.print("\t");
			}
			for(int j = rows; j >= i; j--){
				System.out.print(temp++ + "\t");
			}
			System.out.println();
		}
	}
}
