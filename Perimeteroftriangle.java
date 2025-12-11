import java.util.Scanner;
public class Perimeteroftriangle
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int h = s.nextInt();
		int perimeter=l+b+h;
		System.out.println(perimeter);
	}
}