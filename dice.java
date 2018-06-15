package learning;
import java.util.*;
import java.lang.Math;
public class dice {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int f;
		do {
		System.out.println("Enter the no. of faces in dice.");
		dice rolling = new dice();
		 f = in.nextInt();
		if(f <=1) {
			System.out.println("For rolling it should have atleast 2 faces.");
		}
		else if(f == 2) {
			System.out.println("Hurray you got: "+rolling.toss(f));
			
		}
		else {
			System.out.println("Hurray you got: "+rolling.roll_dice(f));
			
			
		}}
		while(f!=0);
		//int result = roll_dice(f);
		
	}
	public int roll_dice(int max) {
	int	min = 1;
	int a = 	(int)(Math.random()*((max-min)+1))+min;
	return a;
	}
	public String toss(int max) {
		int	min = 1;
		int a = 	(int)(Math.random()*((max-min)+1))+min;
		if(a== 1) {
			return "HEAD";
		}
		else {
			return "TAIL";
		}
		
	
	}

}
