import java.util.Scanner;
public class LongestIncreasingSequence {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int counter=1;
		int maxIncrease=0;
		
		int[]arr=new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr.length==1) {
				maxIncrease=1;
				break;
			}
			if (i==arr.length-1) {
				if (arr[arr.length-1]>arr[arr.length-2]) {
					counter++;
				}
				
				if (maxIncrease<counter) {
					maxIncrease=counter;
				}
				break;
			}
			
			if (arr[i]<arr[i+1]) {
				counter++;
				if (maxIncrease<counter) {
					maxIncrease=counter;
				}
			}
			else {
				counter=1;
			}
		}
		System.out.println(maxIncrease);
	}

}
