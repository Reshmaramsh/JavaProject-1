package HomeWork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListIterate {
public static void main(String args[]) {
		
		List clriterate= new ArrayList();
		
		clriterate.add ("Violet");
		clriterate.add("Black");
		clriterate.add("White");
		clriterate.add("Blue");
		clriterate.add("Pink");
		System.out.println(clriterate);
		
		Iterator clr= clriterate.iterator();
		
		while(clr.hasNext()) {
			System.out.println(clr.next());
		}
		
}
}