import java.util.Scanner;
public class Calculator{
	public static void main (String[]args){
		Addition();
		System.out.println("You Finished Addition");
		Substruction();
		System.out.println("You Finished Substruction");
		Multiplication();
		System.out.println("You Finished Multiplication");
		Division();
		System.out.println("You Finished Division");
		Remainder();
		System.out.println("You Finished remainder");
		
}

public static void Addition()
	{
	Scanner input=new Scanner(System.in);
	int a,b,sum;
	System.out.print("Enter the First number\n");	
	a=input.nextInt();
	System.out.print("Enter the First number\n");	
	b=input.nextInt();
	sum=a+b;
	System.out.println(sum);
	input.close();
	}
	public static void Substruction()
	{
	Scanner input=new Scanner(System.in);
	int a,b,dif;
	System.out.print("Enter the First number\n");	
	a=input.nextInt();
	System.out.print("Enter the First number\n");	
	b=input.nextInt();
	dif=a-b;
	System.out.println(dif);
	input.close();
	}
	public static void Multiplication()
	{
	Scanner input=new Scanner(System.in);
	int a,b,mult;
	System.out.print("Enter the First number\n");	
	a=input.nextInt();
	System.out.print("Enter the First number\n");	
	b=input.nextInt();
	mult=a*b;
	System.out.println(mult);
	input.close();
	}
	
	public static void Division()
	{
	Scanner input=new Scanner(System.in);
	int a,b,div;
	System.out.print("Enter the First number\n");	
	a=input.nextInt();
	System.out.print("Enter the First number\n");	
	b=input.nextInt();
	div=a/b;
	System.out.println(div);
	input.close();
	}
public static void Remainder()
	{
	Scanner input=new Scanner(System.in);
	int a,b,rem;
	System.out.print("Enter the First number\n");	
	a=input.nextInt();
	System.out.print("Enter the First number\n");	
	b=input.nextInt();
	rem=a%b;
	System.out.println(rem);
	input.close();
	}
	
 }