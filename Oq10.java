import java.util.Scanner;
public class Oq10
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b =a/100;
		int c=a%10;
	    System.out.println(c+b);
	}
}

