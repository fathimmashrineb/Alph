import java.util.*;
public class Alph
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if((n>='a' && n<='z')||(n>='A' && n<='Z'))
        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not an alphabet");
        }
    }
}
