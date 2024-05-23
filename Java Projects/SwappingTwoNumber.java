public class SwappingTwoNumber{
    public static void main(String []args){
        int []array={2,4,6,8,9,1};
        int index1=1;
        int index2=3;

        System.out.println("Original array: ");
        printArray(array);

        swapNumbers(array, index1, index2);

        System.out.println("Array after swapping: ");
        printArray(array);
        
    }
        public static void swapNumbers(int[] arr,int index1,int index2){
            if(index1<0||index1>arr.length||index2<0||index2>arr.length){
                System.out.println("Incorrect induces");
                return;
            }
            arr[index1]=arr[index1]+arr[index2];
            arr[index2]=arr[index1]-arr[index2];
            arr[index1]=arr[index1]-arr[index2];
        
}
public static void printArray(int[]array){
    for (int i : array) {
        System.out.print(i+" ");
    }
}
}