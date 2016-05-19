
/**
 * Write a description of class QuadraticFunction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuadraticFunction
{
    private int a;
    private int b;
    private int c;

    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double valueAt(double x) {
        return a * x * x + b * x + c;
    }

    public String toString (  ) {
        String s = "";
        if(a==1)
            s+="x^2 ";
        else if(a != 0) {
            s+=a + "x^2 ";
        }
        if(a==1)
            s+="x ";
        else if(b > 0) {
            s+="+ " + b +"x ";
        }
        else if(b<0) {
            s+=b +"x ";
        }
        if(c > 0) {
            s+="+ " + c;
        }
        else if(c<0) {
            s+=c;
        }
        return s;
    }

}
