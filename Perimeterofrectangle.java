import java.util.Scanner;
public class Perimeterofrectangle
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int perimeter=2*(l+b);
		System.out.println(perimeter);
	}
}