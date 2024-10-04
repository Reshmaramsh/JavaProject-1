package pkg.one;
import java. util.Scanner;
public class Offseason {
	public void discountOffOn(){
	
	int discount;
	int amount;
	int mrp;
	int s;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the mrp");
mrp= sc.nextInt();

System.out.println("Enter the discount percentage");
discount= sc.nextInt();

s=100-discount;
amount=(s*mrp)/100;
System.out.println("Amount after discount=" +amount);
}
}