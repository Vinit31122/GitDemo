package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AccessModifiers {
	
	public static void main(String[] args) {
		
		ArrayList<String> as= new ArrayList<String>();
		Iterator<String> iterate = as.iterator();
		while (iterate.hasNext()) {
			iterate.next();
		}
	}
	
	

}
