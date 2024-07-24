class Prog6{
	public static void main(String[] args){
	int num = 0;
	if(num == 0){
		System.out.println("Number is Zero");
	}
	else if(num % 3 ==0 && num % 7 == 0){
		System.out.println(num + " is divisibele by 3 and 7");
	}
	else if(num % 3 == 0){
		System.out.println(num + " is divisible by 3");
	}
	else if(num % 7 == 0){
		System.out.println(num + " is divisible by 7");
	}
	else{
		System.out.println("Number is neither divisible by 3 nor by 7");
	}
	}
}
