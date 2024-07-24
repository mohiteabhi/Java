import java.io.*;
class Prog8_EmpAge{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Total Employees: ");
		int empSize = Integer.parseInt(br.readLine());

		int arr[] = new int[empSize];
		System.out.println("Enter Employee's Age");
		System.out.println("Total Number of employee's are: " + empSize);
		for(int i = 0; i < empSize; i++){
			arr[i] = Integer.parseInt(br.readLine());
			System.out.println("Age of "+(i+1)+"st employee is: " + arr[i]);
		}
	}
}
