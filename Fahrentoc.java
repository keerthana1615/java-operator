import java.util.Scanner;
public class Fahrentoc
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double f = s.nextDouble();
		double c = (f-32)*5.0/9.0;
		System.out.println(c);
		
	}
}
