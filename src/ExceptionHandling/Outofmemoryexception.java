package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Outofmemoryexception {

	public static void main(String[] args) {

		List ramdonlist = new ArrayList();

		Random ra = new Random();

		while (true) {
			ramdonlist.add(ra.nextInt()); // java.lang.OutOfMemoryError
		}

	}

}