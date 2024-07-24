class Prog2_EvenOdd{
	public static void main(String[] args){
		int num = 8;
		if(num % 2 == 0){
			System.out.println(num + " is an even Number");
		}
		else if(num % 2 != 0){
			System.out.println(num + " is an odd Number");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}
