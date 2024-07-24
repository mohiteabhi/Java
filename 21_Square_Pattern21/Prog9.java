import java.util.*;
class Prog9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Rows = " + rows);

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				if(i % 2 == 1){
					if(j % 2 == 1){
						System.out.print(j * 2 + " ");
					}
					else{
						System.out.print(j * 3 + " ");
					}
				}
				else {
					if(j % 2 == 1){
						System.out.print(j * 3 + " ");
					}
					else{
						System.out.print(j * 2 + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
/*
 2 6 6
 3 6 9
 2 6 6
 */
