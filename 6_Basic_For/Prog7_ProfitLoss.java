class Prog7_ProfitLoss{
	public static void main(String[] args){
		int sellingPrice = 500;
		int costPrice = 900;
		if(sellingPrice > costPrice){
			int Profit = sellingPrice - costPrice;
			System.out.println("Profit of " + Profit);
		}
		else if(costPrice > sellingPrice){
			int loss = costPrice - sellingPrice;
			System.out.println("Loss of " + loss);
		}
		else {
			System.out.println("No profit no loss");
		}
	}
}
