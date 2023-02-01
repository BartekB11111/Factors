package factors;
import java.util.Scanner;

public class factors {

	static void factor(int n) {
		int e=2;
		while(e<=n) {
			if(n%e==0) 
			{
				n=n/e;
				System.out.println(e);
			}
			else
				e++;
		}		
		
	}
	public static void main(String[] args) {
		int t=0;
		while(t==0) {
			System.out.println("Input a number");
			Scanner number = new Scanner(System.in);
			int n = number.nextInt();
			if(n>0) {
				t=1;
				factor(n);
			}
			else
			continue;
		}
	}

}
