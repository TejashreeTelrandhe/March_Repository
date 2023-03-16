package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemory_Error {

	public static void main(String[] args) {
		List random = new ArrayList();
		Random r = new Random();
		while (true) {
			random.add(r.nextInt());
		}
	}

}
