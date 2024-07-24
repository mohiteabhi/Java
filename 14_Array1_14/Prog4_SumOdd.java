import java.io.*;
class Prog4_SumOdd{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] % 2 == 1){
				sum = sum + arr[j];
			}
		}
		System.out.println("Sum of odd elements : " + sum);

	}
}
