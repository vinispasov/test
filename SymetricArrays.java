import java.util.Scanner;
public class SymetricArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		boolean isSymetric=true;
		
		for (int i = 0; i < n; i++) {
			String input=sc.nextLine();
			String[]arr=input.split(" ");
			
			for (int j =0; j < arr.length; j++) {
				if (arr[j].equals(arr[arr.length-1-j])) {
					isSymetric=true;
				}
				else {
					isSymetric=false;
					break;
				}
				
			}
			if (isSymetric) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
