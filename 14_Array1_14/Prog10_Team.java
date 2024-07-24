import java.io.*;
class Peog10_Team{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Total Number of players in team: ");
		int teamSize = Integer.parseInt(br.readLine());

		String Abhi[] = new String[teamSize];
		for(int i = 0; i < teamSize; i++){
			Abhi[i] = br.readLine();
		}
		for(int i = 0; i < teamSize; i++){
			System.out.println(Abhi[i]);
		}

	}
}
