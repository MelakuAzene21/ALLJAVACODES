package Traning;

public class PrintLetter {

   public static void main(String[] args) {
       char x = 'A';
       for (int i = 0; i <=5; i++) {
           for (int j = 0; j < i; j++) {
               
               System.out.print(x);
               x++;
               
           }
           
           System.out.println();
         x='A';
           
       }
       
   }
}
