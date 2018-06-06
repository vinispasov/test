import java.util.Scanner;
public class BigNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		String[]arr=input.split(" ");
		
		int n1=Integer.parseInt(arr[0]);
		int n2=Integer.parseInt(arr[1]);
		
		int[]arr1=new int[n1];
		int[]arr2=new int[n2];
		
		for (int i = 0; i < n1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		for (int i = 0; i < n2; i++) {
			arr2[i]=sc.nextInt();
		}
			
		sumDigits(arr1,arr2);
			
			
		
		
	}
	
	private static void sumDigits(int[]arr1,int[]arr2) {
		
		int sum=0;
		int counter=0;
		int firstArr;
		int secondArr=0;
		StringBuilder sb=new StringBuilder();
		
		if (arr1.length>arr2.length) {
			
		for (int i = 0; i < arr1.length; i++) {
			
			
			firstArr=arr1[i];
			for (int j = counter; j < arr2.length; j++) {
				secondArr=arr2[j];
				break;
			}
			if (counter>=arr2.length) {
				secondArr=0;
			}
			sum+=(firstArr+secondArr);
			counter++;
			
			int firstDigit=sum/10%10;
			int secondDigit=sum%10;
			
			
			sb.append(secondDigit);
			sb.append(" ");
			sum=firstDigit;
			
		}
		System.out.println(sb.toString());
		}
		
		else if (arr1.length<=arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				
				firstArr=arr2[i];
				for (int j = counter; j < arr1.length; j++) {
					secondArr=arr1[j];
					break;
				}
				if (counter>=arr1.length) {
					secondArr=0;
				}
				sum+=(firstArr+secondArr);
				counter++;
				
				int firstDigit=sum/10%10;
				int secondDigit=sum%10;
		
				
				sb.append(secondDigit);
				sb.append(" ");
				sum=firstDigit;
				
			}
			System.out.println(sb.toString());
		}
		
	}

}
