package collectiondemos;

import java.util.*;
import java.io.*;

public class HDTVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create ArrayList to stor 3 Objects
		ArrayList<HDTV> al2 = new ArrayList<HDTV>();
		al2.add(new HDTV("LG", 21));
		al2.add(new HDTV("Sony", 54));
		al2.add(new HDTV("Videocon", 15));

		System.out.println("Sorting by Name...");

		// Here we pass ArraList Object to sort method
		Collections.sort(al2, new BrandComparator());
		for (HDTV hdtv : al2) {
			System.out.println(hdtv.brandname + " " + hdtv.size);
		}

	}

}
