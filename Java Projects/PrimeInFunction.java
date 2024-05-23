package Traning;

import java.util.Scanner;

public class PrimeInFunction {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
   num=in.nextInt();
  boolean isPrime=isPrime(num);
  if(isPrime)
    System.out.println(num+" is Prime number");
  else
    System.out.println(num+"is not Prime");
    in.close();

    }

public static boolean isPrime(int n){
boolean isPrime=true;
for(int i=2;i<=n/2;i++){
if(n%i==0){
    isPrime=false;
    break;
}
}
return isPrime;
    }


}
