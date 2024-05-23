package Traning;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
       String name;
Scanner input=new Scanner(System.in);
System.out.println("Enter Your Name");
name=input.nextLine();
int NumberofVowels=VowelCount(name);
System.out.println(NumberofVowels);
input.close();
    }
    private static int VowelCount(String str){
  str=str.toLowerCase();
  int counter=0;
  for(int i=0;i<str.length();i++){
    char x=str.charAt(i);
    if(x=='a'||x=='e'||x=='u'||x=='i'||x=='o'){
        counter++;
    }
  }
  return counter;
  
    }

}
