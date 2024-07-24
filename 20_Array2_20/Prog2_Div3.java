import java.io.*;
class Prog2_Div3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0;
		System.out.print("Elements divisible by 3: ");
		for(int j = 0; j < size; j++){
			if(arr[j] % 3 == 0){
				System.out.print(arr[j] + " ");
				sum+=arr[j];
			}
		}
		System.out.print("\n Sum of elements divisible by 3 is : " + sum);

	}
}
