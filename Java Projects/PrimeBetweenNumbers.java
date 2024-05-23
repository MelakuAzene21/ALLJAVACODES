package Traning;

import java.util.Scanner;

public class PrimeBetweenNumbers {
    public static void main(String[] args) {
        int low,high;
        Scanner interval=new Scanner(System.in);
        System.out.println("Enter The Starting of Prime number");
        low=interval.nextInt();
        System.out.println("Enter The Ending Number");
        high=interval.nextInt();

        while(low<high){
             boolean flag = false;
         for(int i=2;i<=low/2;i++){
           
            if(low%i==0){
                flag=true;
                break;
            }
         }

     
            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;   
        }        
        interval.close();
    }
}
