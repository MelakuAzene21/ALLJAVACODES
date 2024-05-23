import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        int x,reverse=0;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the number to Reverse");
        x=scanner.nextInt();
        System.out.println("The Original Number is" + x);
        while (x!=0) {
           reverse=reverse*10;
           reverse=reverse+x%10;
           x=x/10; //to decrease one digit of number 
        }
        
        System.out.println("The Reversed Number is"+reverse);
        scanner.close();
    }
}
