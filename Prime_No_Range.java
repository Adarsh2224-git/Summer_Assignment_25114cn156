import java.util.Scanner;
public class Prime_No_Range {
public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
int start, end, i, j, count;
System.out.println("Enter starting number :");
start= sc.nextInt();
System.out.println("Enter the ending number");
end = sc.nextInt();
for(i=start; i<=end;i++){
    if(i<=1){
        continue;

    }
count = 0;
for(j=1; j<=i;j++) {
    if(i%j==0){
        count++;
    }
}
if(count==2) {
    System.out.println(i+ "");
}
}
}


}