class Prog9_Prime{
	public static void main(String[] args){
		int arr[] = {5,7,9,11,15,19,90};
		for(int i = 0; i < arr.length; i++){
			int count = 0;
			for(int j = 1; j <= arr[i]; j++){
				if(arr[i] % j == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.print(arr[i] + " ");
			}
		}

	}
}
