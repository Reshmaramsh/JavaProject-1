package pkg.one;
import java. util.Scanner; 
public class Address extends Student {
	public static void main(String args[]) {
		
		Address hi= new Address();
		hi.nameAndAddress();
	}
	public void adressFind() {
		System.out.println("Enter an address");
		Scanner sc= new Scanner(System.in);
		String address= sc.next();
	}

}
