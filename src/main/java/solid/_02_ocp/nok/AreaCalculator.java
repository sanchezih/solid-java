package solid._02_ocp.nok;

//Updated class violating OCP by modifying existing code
public class AreaCalculator {
	public double calculateRectangleArea(double width, double height) {
		return width * height;
	}

	public double calculateCircleArea(double radius) {
		return Math.PI * radius * radius;
	}

	// New method added for calculating the area of a triangle
	public double calculateTriangleArea(double base, double height) {
		return 0.5 * base * height;
	}
}
