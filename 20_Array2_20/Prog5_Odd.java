import java.io.*;
class Prog5_Odd{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0;
		for(int j = 0; j < size; j++){
			if(j % 2 == 1){
				sum += arr[j];
			}
		}
		System.out.print("\n Sum of odd indexed elements : " + sum);
	}
}
