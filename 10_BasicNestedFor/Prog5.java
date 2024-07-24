import java.util.*;
class Prog5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Number of rows = " + row);
		char ch = 'A';
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= row; j++){
				System.out.print(ch + " ");
				ch += 2;
			}
			System.out.println();
		}
	}
}
