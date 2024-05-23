package Traning;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number To Check Prime or not");
        Scanner prime=new Scanner(System.in);
        n=prime.nextInt();
        boolean flag=false;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
              flag=true;
              break;
            }
        }
if (flag==false) {
    System.out.println( n+" is Prime");
}
    else{
        System.out.println(n+"is not Prime");
    }   
    prime.close(); 
    }
}
