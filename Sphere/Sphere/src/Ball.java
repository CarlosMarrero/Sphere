
public class Ball extends Sphere {

	private String name;
	
	public Ball() {
		super();
		this.name = new String("Unknown");
	}
	
	public Ball(String name, double radius) {
		super(radius);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object other) {
		boolean answer = false;
		
		if (other instanceof Ball) {
			answer = this.name.equals(((Ball)other).getName()) &&
					super.equals(other);
		}
		return answer;
	}

	@Override
	public double getArea() {
		double area = 0.0;
		
		area = Math.PI * super.getRadius() * super.getRadius();
		
		return area;
	}
	
	@Override
	public void displayStatistics() {
		System.out.println("         Name = " + this.name);
		super.displayStatistics();
	}
}
