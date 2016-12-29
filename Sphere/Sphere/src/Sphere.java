
public class Sphere extends EquidistantShape {
	
	public Sphere() {
		super();
	}
	
	public Sphere(double radius) {
		super(radius);
	}
	
	@Override
	public double getDiameter() {
		return super.getRadius() * 2;
	}
	
	@Override
	public double getCircumference() {
		return Math.PI * getDiameter();
	}
	
	@Override
	public double getArea() {
		return 4.0 * Math.PI * super.getRadius() * super.getRadius();
	}
	
	public double getVolume() {
		return (4.0 * Math.PI * Math.pow(super.getRadius(), 3.0)) / 3.0;
	}
	
	@Override
	public void displayStatistics() {
		super.displayStatistics();
		System.out.println("     Diameter = " + getDiameter());
		System.out.println("Circumference = " + getCircumference());
		System.out.println("         Area = " + getArea());
		System.out.println("       Volume = " + getVolume());
	}
	
}
