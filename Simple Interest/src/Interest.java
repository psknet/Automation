import java.util.Scanner;

public class Interest {

	public Interest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Principal;
	    double RateofInterest;
	    double Time;
	    Scanner readinput = new Scanner(System.in);
	    
	    try {
			System.out.println("Please enter the Principal Amount");
			Principal = readinput.nextDouble();
			
			System.out.println("Please enter the Rate of Interest Percentage");
			RateofInterest = readinput.nextDouble();
			
			System.out.println("Please enter the Time in years");
			Time = readinput.nextDouble();
			
			// Performing Interest Calculations
			double interestresult = (Principal * (RateofInterest / 100) * Time);
			
			System.out.println("The simple Interest calculated $" + interestresult);
			
            // Performing Squares roots using Math class
			System.out.println("The program will calculate squares roots");
            double A = readinput.nextDouble();
            A = Math.sqrt(A);
			System.out.println("The square root your number is " + A);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    readinput.close();
	    
	    
	}

}
