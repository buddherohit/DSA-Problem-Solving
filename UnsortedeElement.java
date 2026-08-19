
public class UnsortedeElement {
    static int unsortedElement(int arr[]){
       
        for(int i=0; i<arr.length; i++){
            if(arr[i+1]<=arr[i]){             // check if the next element is less than or equal to the current element
                return arr[i+1];
            }
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int arr[]={1,3,4,2,6,7,8,9,10};
       System.out.println("The unsorted element in the array is: " + unsortedElement(arr));
}
}
