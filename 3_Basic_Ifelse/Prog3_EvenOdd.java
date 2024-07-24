class Prog3_EvenOdd{
	public static void main(String[] args){
		int num = 9;
		if(num % 2 == 0){
			if(num > 10){
				System.out.println(num + " is an even number and Greater than 10");
			}
			else{
				System.out.println(num + " is an even number and less than 10");
			}
		}
		else if(num % 2 != 0){
			if(num > 10){
				System.out.println(num + " is an odd number and Greater than 10");
			}
			else{
				System.out.println(num + " is an odd number and less than 10");
			}
			
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}
