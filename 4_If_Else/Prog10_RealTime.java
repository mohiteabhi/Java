class Prog10_RealTime{
	public static void main(String[] args){
		int feesPaid = 15000;
		if(feesPaid == 10000){
			System.out.println("You have completed fees you can join ");
		}
		else if(feesPaid > 0 && feesPaid < 10000 && feesPaid != 10000){
			System.out.println("You can join the session after paying remaining amount of " + (10000 - feesPaid));
		}
		else if(feesPaid > 10000){
			System.out.println("Total fee is 10000 and you have paid " + feesPaid + " take this " + (feesPaid - 10000) + " and join the sessions");
		}
		else{
			System.out.println("You have not paid the fees");
		}
	}
}
