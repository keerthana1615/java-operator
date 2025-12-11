import java.util.Scanner;
public class Areaoftriangle
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int h = s.nextInt();
		double area = 0.5*b*h;
		System.out.println(area);
	}
}