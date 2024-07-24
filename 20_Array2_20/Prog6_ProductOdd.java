import java.io.*;
class Prog6_ProductOdd{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int productOdd = 1;
		for(int j = 0; j < size; j++){
			if(j % 2 == 1){
				productOdd *= arr[j];
			}
		}
		System.out.print("\nProduct of odd indexed elements : " + productOdd);
	}
}
