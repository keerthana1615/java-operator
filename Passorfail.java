import java.util.Scanner;
public class Passorfail
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a<40){
		    System.out.println("sorry you failed");
		}
		else{
		    System.out.println("yeyy you passed");
		}
		
	}
}
