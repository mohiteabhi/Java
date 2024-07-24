import java.io.*;
class Prog10_ThirdLarge{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		for(int i = 1; i < size; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Max: " + max);


		int secMax = arr[1];
		for(int i = 1; i < size; i++){
			if(arr[i] > secMax && arr[i] < max){
				secMax = arr[i];
			}
		}
		System.out.println("Second Max: " + secMax);
		
		int thirdMax = arr[2];
		for(int i = 1; i < size; i++){
			if(arr[i] > thirdMax && arr[i] < secMax){
				thirdMax = arr[i];
			}
		}
		System.out.println("Third Max: " + thirdMax);
	}
}
