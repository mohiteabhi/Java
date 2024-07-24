import java.util.*;
class Prog9_Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter elements: ");
		char arr[] = new char[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for(int j = 0; j < size; j++){
			if(arr[j] <= 90){
				arr[j] = '#';
			}
			System.out.println(arr[j]);
		}
	}
}
