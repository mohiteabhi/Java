class Prog8_Rev{
	public static void main(String[] args){
		char arr[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		System.out.println("Before reverse");
		for(int i = 0; i < arr.length; i++){
			if(i % 2 == 0){
				System.out.print(arr[i] + " ");
			}
		}

		char temp = 0;
		int size = arr.length;
		for(int i = 0; i < (size / 2); i++){
			temp = arr[i];
			arr[i] = arr[size - 1 - i];
			arr[size - 1 - i] = temp;
		}
		System.out.println("\nAfter Reverse: ");
		for(int j = 0; j < size; j++){
			if(j % 2 == 0){
				System.out.println(arr[j] + " ");
			}
		}
	}
}
