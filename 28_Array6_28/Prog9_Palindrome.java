class Prog9_Palindrome{
	public static void main(String[] args){
		int arr[] = {121, 1, 58, 333, 616, 9};

		int count = 0;
		for(int i = 0; i < arr.length; i++){
			int temp = arr[i]; //121
			int rev = 0;
			while(temp > 0){
				int rem = temp % 10;
				rev = rev*10 + rem;
				temp/=10;
			}
			if(rev == arr[i]){
				count++;
			}
		}
		System.out.println("Count of palindrome elements is: " + count);
	}
}
