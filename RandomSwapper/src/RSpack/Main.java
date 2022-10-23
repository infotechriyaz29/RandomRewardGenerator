package RSpack;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String arr[];
		arr = new String[10];
		arr[0]="1 Gold";
		arr[2]="2 Gold";
		arr[4]="1 Diamond";
		arr[6]="2 Diamond";
		arr[8]="1 Ruby";
		arr[1]="2 Ruby";
		arr[3]="20 Rs";
		arr[5]="20 Dl";
		arr[7]="0 Gold";
		arr[9]="0 Gold";
		System.out.println("Possible Rewards:");
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		Random r = new Random();
		int k;
		k = r.nextInt(10);
		/*System.out.println(k);*/
		
		String temp;
		
		for(int times=0;times<k;times++) {			
			for(int j=1;j<10;j++) {
				temp=arr[0];
				arr[0]=arr[j];
				arr[j]=temp;
			}
		}
		/*System.out.println("Array After swap:");
		for(int m=0;m<10;m++) {
			System.out.println(arr[m]);
		}*/
		int loop=-1;
		while(loop<0 || loop>=10) {
			System.out.print("Enter a number from 0-9 to generate a random reward:");
			Scanner sc;
			sc = new Scanner(System.in);
			loop = sc.nextInt();
			if(loop>=0 && loop <10) {
				System.out.println("Your Randomly Generated Reward is:"+arr[loop]);
			}
		}
	}
	
}
