import java.util.*;
import java.lang.Math;
public class hypotenuse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        // int h = (a*a + b*b);
        // float hyp = float.Math.sqrt(h);
        double c = Math.hypot(a,b);
        System.out.printf("%.2f",c);
    }
}