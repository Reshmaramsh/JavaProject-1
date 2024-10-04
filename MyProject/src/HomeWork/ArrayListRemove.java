package HomeWork;
import java.util.ArrayList;
import java.util.List;
public class ArrayListRemove {
	
	public static void main(String args[]) {
			
			List clrremove= new ArrayList();
			
			clrremove.add ("Violet");
			 clrremove.add("Black");
			 clrremove.add("White");
			 clrremove.add("Blue");
			 clrremove.add("Pink");
			System.out.println( clrremove);
			clrremove.remove(3);
			System.out.println(clrremove);
}
}