import java.util.Scanner;

public class Sphere
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double surfacearea = 4*3.14*(r*r);
		double volume = (4/3)*3.14*r*r*r;
		double circumference = 2*3.14*r;
		System.out.println("surface area of sphere:"+surfacearea);
		System.out.println("volume:"+volume);
		System.out.println("circumference:"+circumference);
	}
}