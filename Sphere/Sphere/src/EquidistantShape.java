
public abstract class EquidistantShape {

	private double radius;
	private static final double DEFAULT_RADIUS = 1.0;

	
	public EquidistantShape() {
		this.radius = DEFAULT_RADIUS;
	}
	
	public EquidistantShape(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	public boolean equals(Object other) {
		boolean answer = false;
		
		if (other instanceof Sphere) {
			answer = (this.radius == ((EquidistantShape)other).getRadius());
		}
		
		return answer;
	}

	public abstract double getDiameter();
	public abstract double getCircumference();
	public abstract double getArea();

	public void displayStatistics() {
		System.out.println("       Radius = " + this.radius);
	}

	
}
