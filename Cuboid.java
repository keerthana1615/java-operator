import java.util.Scanner;

public class Cuboid
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double l = s.nextDouble();
		double b = s.nextDouble();
		double h = s.nextDouble();
		double surfacearea = 2*((l*b)+(b*h)+(h*l));
		double volume = l*b*h;
		double perimeter = 4*(l+b+h);
		System.out.println(surfacearea);
		System.out.println(volume);
		System.out.println(perimeter);
	}
}