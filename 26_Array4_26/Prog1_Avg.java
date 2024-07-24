import java.io.*;
class Prog1_Avg{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int avg = 0;
		for(int j = 0; j < size; j++){
			avg += arr[j];
		}
		System.out.println("Array elements average is: " + (avg / size));
	}
}
