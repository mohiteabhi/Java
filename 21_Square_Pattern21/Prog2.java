import java.util.*;
class Prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Rows = " + rows);
		int temp = rows;

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				if(temp % 3 == 0){
					System.out.print(temp*3 + " ");
				}
				else if(temp % 5 == 0){
					System.out.print(temp*5 + " ");
				}
				else{
					System.out.print(temp + " ");
				}
				temp++;
			}
			System.out.println();
		}
	}
}
