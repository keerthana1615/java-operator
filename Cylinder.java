import java.util.Scanner;

public class Cylinder
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double h = s.nextDouble();
		double total_surfacearea = 2*3.14*r*(r+h);
		double volume = 3.14*r*r*h;
		double perimeter = 2*3.14*r;
		System.out.println("surface area of sphere:"+total_surfacearea);
		System.out.println("volume:"+volume);
		System.out.println("perimeter:"+perimeter);
	}
}