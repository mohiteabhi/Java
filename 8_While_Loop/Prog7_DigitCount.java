class Prog7_DigitCount{
	public static void main(String[] args){
		int num = 93079224;
		int count = 0;
		while(num > 0){
			num /= 10;
			count++;
		}
		System.out.println("Count of digits= " + count);
	}
}
//Count of digits= 8
