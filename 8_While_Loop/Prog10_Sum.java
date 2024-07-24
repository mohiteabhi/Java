class Prog10_Sum{
	public static void main(String[] args){
		long num = 9307922405L;
		long sum = 0;
		while(num > 0){
			long rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		System.out.println("sum of digits in 9307922405 is " + sum);
	}
}
