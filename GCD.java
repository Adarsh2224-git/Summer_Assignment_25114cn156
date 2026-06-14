import java.util.Scanner;
public class GCD {
    

public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int a,b,gcd =1, i;
    System.out.println("Enter the first number :");
    a = sc.nextInt();
    System.out.println("Enter the second number");
    b = sc.nextInt();
    for(i=1;i<=a && i<=b;i++){
        if(a%i == 0 && b%i==0) {
            gcd=i;

        }
    }
System.out.println("GCD = "+gcd);

}
}