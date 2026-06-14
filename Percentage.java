import java.util.Scanner;
public class Percentage {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the physics marks :");
    float physics = sc.nextInt();
    System.out.println("Enter the hindi marks :");
    float hindi = sc.nextInt();
    System.out.println("Enter the eng marks :");
    float eng = sc.nextInt();
    System.out.println("Enter the maths marks :");
    float maths = sc.nextInt();
    System.out.println("Enter the sst marks :");
    float sst = sc.nextInt();
   float sum = physics+maths+hindi+eng+sst ;
   float percentage = sum/5;
   System.out.println(+percentage);

  }  
}
