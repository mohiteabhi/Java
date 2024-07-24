import java.util.Scanner;
class Prog3_SecLargest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for(int j = 1; j < size; j++){
			if(arr[j] > max){
				max = arr[j];
			}
		}
		int secMax = arr[0];
		for(int k = 1; k < size; k++){
			if(arr[k] >= secMax && arr[k] < max){
				secMax = arr[k];
			}
		}
		System.out.println("Max element found is " + max);
		System.out.println("second Max element is " + secMax);
	}
}
//arr[] = {3, 2, 1, 4};
