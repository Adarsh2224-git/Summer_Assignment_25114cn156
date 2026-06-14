import java.util.Scanner;
public class  KilometerToMile {
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter distance in kilometer :");
    int kilometer = sc.nextInt();
    double mile = 0.62*kilometer ;
System.out.println(mile);
}
}