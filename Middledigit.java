import java.util.Scanner;
public class Middledigit
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>99 && a<1000)
		{
		int fd = a/10;
		int md = fd%10;
			System.out.println(md);
		}
		else{
		System.out.println("wrong input");
		}
	}
}
