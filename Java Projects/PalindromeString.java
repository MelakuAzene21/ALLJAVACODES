

  import java.util.*;
  
  public class PalindromeString {
      public static void main(String args[]) {
  String original;
  Scanner scanner= new Scanner(System.in);
  System.out.println("Enter A string to Check Palidrome or Not");
  original=scanner.nextLine();
  int length = original.length();
  int begin,middle,end,i;
  begin=0;
 end=length-1;
middle=(begin+end)/2;
  for(i=begin;i<=middle;i++){
  if(original.charAt(begin)==original.charAt(end)){
  begin++;
  end--;
  }
  else{
  break;
  }
  scanner.close();
  }
  
  if(i==middle+1){
  System.out.println("The String is Palindrome");
  }
  else{
  System.out.println("It is Not Palindrome");
  }
  scanner.close();
  }
  }
 