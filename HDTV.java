package collectiondemos;

//class HDTV implements Comparable inteface
public class HDTV implements Comparable<HDTV> {

	String brandname;
	int size;

	// HDTV constructor takes two parameter
	HDTV(String brandname, int size) {
		this.brandname = brandname;
		this.size = size;
	}

	// compareTo method takes HDTV object
	public int compareTo(HDTV hdtv) {
		if (size == hdtv.size)
			return 0;
		else if (size > hdtv.size)
			return 1;
		else
			return -1;
	}
}
