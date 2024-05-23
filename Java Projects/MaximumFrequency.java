
   public class MaximumFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 5, 6, 2}; // Example array
        
        int maxFrequency = findMaxFrequency(array);
        
        System.out.println("Maximum frequency of an element: " + maxFrequency);
    }
    
    // Method to find the maximum frequency of an element in an array
    public static int findMaxFrequency(int[] array) {
        int maxFrequency = 0;
        
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int frequency = 1;
            
            // Count the frequency of the current element
            for (int j = i + 1; j < array.length; j++) {
                if (currentElement==array[j] ) {
                    frequency++;
                }
            }
            
            // Update maxFrequency if current frequency is greater
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        
        return maxFrequency;
    }
}
