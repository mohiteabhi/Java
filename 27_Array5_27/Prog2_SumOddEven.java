import java.io.*;
class Prog2_SumOddEven{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sumOdd = 0;
		int sumEven = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] % 2 == 1){
				sumOdd += arr[j];
			}
			else{
				sumEven += arr[j];
			}
		}
		System.out.println("Odd Sum = " + sumOdd);
		System.out.println("Even Sum = " + sumEven);
	}
}
