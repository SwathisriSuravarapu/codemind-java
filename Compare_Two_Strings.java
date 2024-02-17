import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String h = sc.nextLine();
        if(s.equals(h)){
            System.out.print("Strings are Equal");
        }
        else{
            System.out.print("Strings are not Equal");
        }
    }
}