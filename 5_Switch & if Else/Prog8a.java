class Prog8a{
	public static void main(String[] args){
		int num1 = 4;
		int num2 = 5;
		int multiply;
		if(num1 > 0 && num2 > 0){
		multiply = num1 * num2;

		switch(multiply % 2){
			case 1:
				System.out.println("Multiplication is odd");
				break;
			case 0:
				System.out.println("Multiplication is even");
				break;
			default:
				System.out.println("Negative numbers not allowed");
		}
		}
	}
}


