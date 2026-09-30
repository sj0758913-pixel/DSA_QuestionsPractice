// program to print reverse of a number
import java.util.*;
public class Reverse_Number {
    public static void rev(int n){
        int rev=0;
        while(n>0){
           rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("reverse = "+rev);
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        a = sc.nextInt();
        rev(a);
    }
}