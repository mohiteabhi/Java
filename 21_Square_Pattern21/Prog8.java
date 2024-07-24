import java.util.*;
class Prog8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Rows = " + rows);

		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int j = 1; j <= rows; j++){
				if((i+j) % 2 == 0){
					System.out.print("# ");
				}
				else{
					System.out.print((char)(64 + temp) + " ");
					temp--;
				}
			}
			System.out.println();
		}
	}
}
/*
 * # C #
 * C # B
 * # C #
 */
