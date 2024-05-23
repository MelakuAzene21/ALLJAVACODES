package Traning;

import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int intialNumber,endingNumber;
        System.out.println("Enter the intial Number");
        intialNumber=sc.nextInt();
        System.out.println("Enter the Ending Number");
        endingNumber=sc.nextInt();
        boolean flag=true;
        int sum=0;
        while(intialNumber<endingNumber){
     
        for(int i=2;i<=intialNumber/2;i++){
            if(intialNumber%i==0){
                flag=false;
                break;
            }
        }
        if(flag&&intialNumber!=1&&intialNumber!=0){
            sum+=intialNumber;
            intialNumber++;
        }
     
        }
        System.out.println("The Sum of a number is:" + sum);
        sc.close();
    }

}
