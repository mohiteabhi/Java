import java.io.*;
class Prog9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int number = Integer.parseInt(br.readLine()); //1 5 6
		int temp = number;
		int size = 0;
		while(temp > 0){
			temp /= 10;
			size++;
		}
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			while(number > 0){
				arr[size - 1 - i] = (number % 10) + 1;
				number /= 10;
				break;
			}
		}
		for(int j = 0; j < size; j++){
			System.out.print(arr[j] + ",");
		}
	}
}
