import java.util.*;
class Prog7_LowerToUpper{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char arr[] = new char[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for(int j = 0; j < size; j++){
			if(arr[j] >= 97 && arr[j] <= 122){
				arr[j] = (char)(arr[j] - 32);
			}
			System.out.println(arr[j]);
		}
	}
}
