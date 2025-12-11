import java.util.Scanner;
public class Distance
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
	double	d = d2-d1;
	double	x = x2-x1;
	System.out.println((d*d)+(x*x));
	}
}
