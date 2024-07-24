import java.io.*;
class Prog1_EvenNo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		System.out.print("even numbers: ");
		for(int j = 0; j < size; j++){
			if(arr[j] % 2 == 0){
				System.out.print(arr[j] + " ");
				count++;
			}
		}
		System.out.print("\n Count of even elements is : " + count);

	}
}
