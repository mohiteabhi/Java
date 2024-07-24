class Prog6{
	public static void main(String[] args){
		byte Date = 04;
		byte Month = 02;
		short Year = 2024;
		int SecondsInDay = 24*60*60;
		int SecondsInMonth = SecondsInDay*30;
		int SecondsInYear = SecondsInDay*12;
		System.out.println(Date+"/"+Month+"/"+Year);
		System.out.println(SecondsInDay);
		System.out.println(SecondsInMonth);
		System.out.println(SecondsInYear);
	}
}
