
public class Driver {

	public static void main(String[] args) {
		
		Sphere s1 = new Sphere(1.5);
		s1.displayStatistics();
		System.out.println();

		Sphere s2 = new Sphere(3.0);
		s2.displayStatistics();
		System.out.println();
		
		Ball b1 = new Ball("Baseball", 1.5);
		b1.displayStatistics();
		System.out.println();
		
		Ball b2 = new Ball("Basketball", 3.0);
		b2.displayStatistics();
		System.out.println();
		
		System.out.println("b1 equal b2 = " + b1.equals(b2));
		System.out.println();
		
		// notice how displayStatistics for Ball is called here
		Sphere s = b1;
		s.displayStatistics();
		
	}
}
