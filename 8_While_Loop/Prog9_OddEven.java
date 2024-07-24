class Prog9_OddEven{
	public static void main(String[] args){
		int num = 214367689;
		int evenCount = 0;
		int oddCount = 0;
		while(num > 0){
			int rem = num % 10;
			if(rem % 2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
			num /= 10;
		}
		System.out.println("Odd count: " + oddCount);
		System.out.println("Even count: " + evenCount);
	}
}
/*
 Odd count: 4
 Even count: 5
 */
