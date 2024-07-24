import java.util.*;
class Prog5_RevArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Reversed Array: ");
		int temp = 0;
		for(int j = 0; j < size / 2; j++){
			temp = arr[j];
			arr[j] = arr[size - 1 - j];
			arr[size - 1 - j] = temp;
			
		}
		for(int k = 0; k < size; k++){
			System.out.println(arr[k]);
		}
	}
}
// 1 2 3 4 5 6
// 0)
// temp = 1
// arr[0] = 6
// arr[5] = 1
// new arr: 6 2 3 4 5 1
// O/P: 6
//
// 1)
// temp = 2;
// arr[1] = 5;
// arr[4] = 2;
// new arr: 6 5 3 4 2 1
// O/P 6 5
//
// 2)
// temp = 3
// arr[2] = 4;
// arr[3] = 3;
// 6 5 4 3 2 1
// O / P 6 5 4 
