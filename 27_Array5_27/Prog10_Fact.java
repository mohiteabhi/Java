import java.io.*;
class Prog10_Fact{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size]; 
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < size; j++){
			int fact = 1;
			for(int k = arr[j]; k > 0; k--){
				fact *= k;
			}
			System.out.print(fact + ", ");
		}
	}
}
