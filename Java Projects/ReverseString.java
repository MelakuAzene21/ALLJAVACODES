import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
       String orignal,reverse=" ";
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter The String To Reverse");
         orignal=scanner.nextLine();
         for(int i= orignal.length()-1;i>=0;i--){
            reverse=reverse + orignal.charAt(i);
         }
         System.out.println("The Reversed String is  "+reverse);
       
         scanner.close();
    }
}
