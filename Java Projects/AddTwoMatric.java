package Traning;

import java.util.Scanner;

public class AddTwoMatric {
    public static void main(String[] args) {
      int row,col,i,j;
      Scanner Inputs = new Scanner(System.in);
      System.out.println("Enter The Number of row");  
    row=Inputs.nextInt();
    System.out.println("Eneter The Number of Columns");
    col=Inputs.nextInt();
    System.out.println("Enter The First Element of Matrics");
    int FirstMatric[][]=new int[row][col];
    int SecondMatric[][]=new int[row][col];
    int sum[][]=new int[row][col];
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
       FirstMatric[i][j]=Inputs.nextInt();
        }
    }

    System.out.println("Enter The Second Matrics");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            SecondMatric[i][j]=Inputs.nextInt();
        }
    }

    //Sum Two Matrics
    System.out.println("The Sum of Two Matric is");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            sum[i][j]=FirstMatric[i][j]+SecondMatric[i][j];//TO Add
        }
    }
    //Display the Result
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.print(sum[i][j]+ " ");
        }
        System.out.println();
    }
    

    }
}
