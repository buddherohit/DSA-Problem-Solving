public class shiftarrayby1 {
    static void shiftArrayBy1(int arr[]){
        int n=arr.length;
        int temp=arr[n-1];         // store the last element of the array in a temporary variable
        for(int i=n-1; i>0; i--){        // shift the elements of the array to the right by 1 position
            arr[i]=arr[i-1];        // assign the value of the previous index to the current index
        }
        arr[0]=temp;        // assign the value of the temporary variable to the first index of the array
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The array after shifting by 1 is: ");
        shiftArrayBy1(arr);
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    
}
