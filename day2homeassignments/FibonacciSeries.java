package week1.day2homeassignments;

public class FibonacciSeries {

	public void findfiboseries() {
		int i = 0;
		int j = 1;
		
		/*
		 * System.out.println(i); System.out.println(j);
		 */
		for (int a = 1; a <= 8; a++) {

			System.out.println(i);
			int k = i + j;
			i = j;
			j = k;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fs = new FibonacciSeries();
		fs.findfiboseries();
	}

}
