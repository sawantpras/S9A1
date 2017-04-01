package collectiondemos;

import java.util.Comparator;
import java.util.*;

//BrandComparator class implements Comparator inteface
class BrandComparator implements Comparator {
	// compare method takes two object
	public int compare(Object o1, Object o2) {
		// Object are typecasted into HDTV and assign to S1 and S2

		HDTV s1 = (HDTV) o1;
		HDTV s2 = (HDTV) o2;

		return s1.brandname.compareTo(s2.brandname);
	}
}
