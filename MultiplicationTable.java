
import java.util.Scanner ;
public class MultiplicationTable {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int n = sc.nextInt();
    System.out.println("Multiplication Table of" +n);
    for (int i = 1; i<=10; i++) {
        System.out.println(n + "X" +i+ "=" + (n*i));
    }

  }  
}
