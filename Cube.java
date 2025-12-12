import java.util.Scanner;

public class Cube
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double surfacearea = 6*a*a;
		double volume = a*a*a;
		double perimeter = 12*a;
		System.out.println(surfacearea);
		System.out.println(volume);
		System.out.println(perimeter);
	}
}