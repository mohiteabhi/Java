import java.util.*;
class Prog8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Number of rows = "+ row);
		for(int i = 1; i <= row; i++){
			int temp = row;
			for(int j = 1; j <= row; j++){
				System.out.print((char) (temp + 96) + " ");
				temp--;
			}System.out.println();	
		}
	}
}
/*
 c b a
 c b a 
 c b a
 */
