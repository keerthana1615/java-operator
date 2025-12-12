import java.util.Scanner;
public class Minutes_seconds
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int sec=m*60;
        System.out.println("after conversion:"+sec);
    }
}