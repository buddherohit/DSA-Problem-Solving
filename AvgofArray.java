public class AvgofArray {
    static double avgOfArray(int arr[]){
        double sum=0;         // initialize sum to 0
        for(int i:arr){      // traverse through the array using for-each loop
            sum=sum+i;       // calculate the sum of all elements in the array
        }
        int size=arr.length;   // get the size of the array
        double avg=sum/size;   // calulate the average by dividing sum by size
        return avg;            // return the average
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The average of array is: " + avgOfArray(arr));
    }
    
}
