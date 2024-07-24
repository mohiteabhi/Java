import java.io.*;
class Prog5_CountDig{
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
			int temp = arr[j];
			int count = 0;
			while(temp > 0){
				//int rem = temp % 10;
				temp /= 10;
				count++;
			}
			System.out.print(count + ",");
		}
	}
}
