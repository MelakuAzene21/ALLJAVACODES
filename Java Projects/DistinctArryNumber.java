package Traning;

import java.util.Scanner;

public class DistinctArryNumber {
    public static void main(String[] args) {
        int counter=0;
        Scanner key=new Scanner(System.in);
        int InputArray[]=new int[10];
       for(int i=0;i<InputArray.length;i++){
        System.out.println("Enter number"+" "+i+":");
        InputArray[i]=key.nextInt();
       }
       System.out.println("Distinct Array are");
       for(int i=0;i<InputArray.length;i++){
        boolean flag=true;
        for(int j=0;j<i;j++){
            if(InputArray[i]==InputArray[j]){
            flag=false;
            break;
            }
        }
        if (flag) {
            counter++;
             System.out.println(" "+InputArray[i]+" ");

        }
       
    }
    System.out.println("There are " + " " + counter + " Distinct Elements");
    
    key.close();
       }
       


}
