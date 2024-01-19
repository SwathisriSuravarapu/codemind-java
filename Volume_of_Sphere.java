import java.util.*;
public class Sphere{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = 3.14*a*a*a;
        System.out.printf("%.2f",((4.0/3.0)*b));
    }
}