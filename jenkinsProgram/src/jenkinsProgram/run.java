package jenkinsProgram;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3 digit no");
		int x=sc.nextInt();
		
		int sum=x;
		int count =0;
		
		while(x!=0) {
		int d=x%10;
		
      count=count+d*d*d;
		x=x/10;
		
		}
		
		
		System.out.println(count);
		if(sum==count) {
			System.out.println("Armstrong number");
			
		}
		else {System.out.println("not a armstrong number");}
		
	

	

	}

}
