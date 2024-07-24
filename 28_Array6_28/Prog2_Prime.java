import java.io.*;
class Prog2_Prime{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the elements of the array: ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int sumPrime = 0;
		int countPrime = 0;
		for(int j = 0; j < size; j++){
			int count = 2;
			for(int k = 2; k < arr[j]; k++){
				if(arr[j] % k == 0){
					count++;
				}
			}
			if(count == 2){
				countPrime++;
				sumPrime += arr[j];
			} 
		}
		System.out.println("Sum of all prime numbers is " + sumPrime + " and count of prime numbers in given array is " + countPrime);
	}
}
