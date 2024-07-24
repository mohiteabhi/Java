import java.util.*;
class Prog7_ASCII{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();

		System.out.println("Enter the elements of the array: ");
		char arr[] = new char[size];
		int a = 0;
		for(int i = 0; i < size; i++){
			a = scan.nextInt();
			if(a > 64 && a < 91){
				arr[i] = (char)(a);
			}
		}
		for(int i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}

		



















/*
		char ch[] = new char[size];
		for(int j = 0; j < size; j++){
			if(arr[j] > 64 && arr[j] < 98){
				ch[j] = (char)(arr[j]);
			}
			else{
				ch[j] = arr[j];
			}
			System.out.print(ch[j] + " ");
		}*/
	}
}
