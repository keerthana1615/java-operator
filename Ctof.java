import java.util.Scanner;
public class Ctof
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c = s.nextInt();
		int f = (32*9/5)+c;
		System.out.println(f);
	}
}
