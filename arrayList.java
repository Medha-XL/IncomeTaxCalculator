package NewOne;

//update from sutra01

import java.util.*;

//update from Ram

public class arrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Leela");
		list.add("Gopal");
		list.add("Chandra");
			
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
	}

}
}

	
