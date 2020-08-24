import java.util.Scanner;
public class unitconversion {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your value in inch :");
		int inch = in.nextInt();
		double meter = inch * 0.0254;
		System.out.println("Input Meter conversion is : "+ meter);
		
	}
}

