class Prog4_Career{
	public static void main(String[] args){
	double Percentage = 85.00;
	if(Percentage > 85.00){
		System.out.println("Medical");
	}
	else if(Percentage <= 85.00 && Percentage > 75.00){
		System.out.println("Engineering");
	}
	else if(Percentage <= 75.00 && Percentage >= 65.00){
		System.out.println("Pharmacy or bachelor in Science");
	}
	else{
		System.out.println("Invalid Percentage");
	}
	}
}
