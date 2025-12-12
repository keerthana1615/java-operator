import java.util.Scanner;
public class Billsplit
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int totalbill = s.nextInt();
        int persons = s.nextInt();
        int split=totalbill/persons;
        System.out.println("after splitting:"+split);
    }
}
