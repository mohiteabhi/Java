class Prog8_PassFail{
	public static void main(String[] args){
	float percent = 47f;
	if(percent >= 75.00f){
		System.out.println("First class with distinction");
	}
	else if (percent > 54.00f && percent <= 75.00f){
		System.out.println("Passed: first class");
	}
	else{
		System.out.println("Pass");
	}
	}
}
