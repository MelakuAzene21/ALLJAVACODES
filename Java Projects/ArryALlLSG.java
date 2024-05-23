package Traning;

import java.util.Scanner;

public class ArryALlLSG {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
       
        System.out.println("How many Numbebers You Enter");
     x=input.nextInt();
  System.out.println("Enter The Number");

        int num[]=new int[x];
  

        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
                }

System.out.println("A Number Greaterthan 50");
for(int n:num){
    if (n < 50){
    continue;  
}
else{
    System.out.println(n + " ");
}

}

 int largest = num[0];
 int smallest = num[0];
 for(int n:num) {
     if (n < smallest) {
         smallest = n;
     }
     if (n > largest) {

         largest = n;
     }
 }



System.out.println("Largest number in The Array is"+" " + largest);
System.out.println("Smallest number in The Array is"+" " + smallest);

for(int i=0;i<num.length;i++){
    int miniIndex=i;
  for(int j=i+1;j<num.length;j++){
if(num[j]<num[miniIndex]){
    miniIndex=j;
}

  }
  int temp = num[i];
  num[i]=num[miniIndex];
  num[miniIndex]=temp;  
}
System.out.println("Ascending order of number");
for(int number:num){
    System.out.print(number+" ");
}
input.close();
}


}


