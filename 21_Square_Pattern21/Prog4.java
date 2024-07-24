import java.util.*;
class Prog4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Rows: " + rows);
		int temp = rows;

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				if(j == 1){
					System.out.print((char)(64 + temp) + "\t");
				}
				else{
					System.out.print(temp + "\t");
				}temp++;
			}
			System.out.println();
		}
	}
}
