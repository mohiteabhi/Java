class Prog5{
	public static void main(String[] args){
		int days = 7;
		while(days >= 0){
			if(days == 0){
				System.out.println(days + " days Assignment is Overdue");
			}
			else{
				System.out.println(days + " days remaining");
			}
			days--;
		}
	}
}
