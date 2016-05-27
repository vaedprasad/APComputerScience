import java.util.*;
/**
 * Write a description of class DecimaltoBinary here.
 * 
 * @author Vaed Prasad
 * @version 10/30/2015
 */
public class DecimalToBinary
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int decimal =input.nextInt();
        
    }

    public String toBinaryd(int x)
    {
    
    
    
    
    
    }
    
    public String toBinary(int x)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        if (x % (int) Math.pow(2,1))
        {
            a=1;
        }
        if (x % Math.pow(2,2))
        {
            b=1;
        }
        if (x % Math.pow(2,3))
        {
            c=1;
        }
        if (x % Math.pow(2,4))
        {
            d=1;
        }
        if (x % Math.pow(2,5))
        {
            e=1;
        }
        if (x % Math.pow(2,6))
        {
            f=1;
        }
        if (x % Math.pow(2,7))
        {
            g=1;
        }
        if (x % Math.pow(2,8))
        {
            h=1;
        }
        if (x % Math.pow(2,9))
        {
            i=1;
        }
        if (x % Math.pow(2,10))
        {
            j=1;
        }
        if (x % Math.pow(2,11))
        {
            k=1;
        }
        if (x % Math.pow(2,12))
        {
            l=1;
        }
        if (x % Math.pow(2,13))
        {
            m=1;
        }
        if (x % Math.pow(2,14))
        {
            n=1;
        }
        if (x % Math.pow(2,15))
        {
            o=1;
        }
        if (x % Math.pow(2,16))
        {
            p=1;
        }
        String binary = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t;
        return binary;
    }
}