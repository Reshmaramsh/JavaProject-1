package pkg.one;

public class Division extends AdditionSuper{

	public static void main (String args[]) {
		Division check= new Division();
		check.additionAndDivision();
	
	}
	
	public int additionAndDivision() {
		int sum= super.additionAndDivision();
		if (sum%10==0) {
			
			System.out.println("Sum is divisible by 10");
		}
		else {
			
			System.out.println("Sum is not divisible by 10");
		}
		return 0;
		
		
	}
}

