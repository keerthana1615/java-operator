import java.util.Scanner;
public class Swappingwithvariable
{
    
 public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int b = s.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        
    }
}
