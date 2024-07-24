import java.util.*;
class Prog10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Rows = " + rows);

		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int j = 1; j <= rows; j++){
				if(i % 2 == 1){
					if(j % 2 == 1){
						System.out.print(temp + " ");
					}
					else{
						System.out.print((char)(64 + temp) + " ");
					}
				}

				else{
					System.out.print((char)(64 + temp) + " ");
				}
				temp--;
			}
			System.out.println();
		}
	}
}
/*
 3 B 1
 C B A
 3 B 1

 */
