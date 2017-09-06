# Factorial
import java.io.*;
import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        //int f=0;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
            System.out.println(fact);
        
    }
}
