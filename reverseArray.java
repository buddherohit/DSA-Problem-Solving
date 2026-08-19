public class reverseArray {
    static void reverseArray(int arr[]){
        int n=arr.length;     // get the length of the array
        int i=0;           // initialize the starting index
        int j=n-1;          // initialize the ending index
        while(i<=j){              //swap the elements at the starting and ending indices until they meet in the middle 
            int temp=arr[i];     // store the value of the starting index in a temporary variable
            arr[i]=arr[j];      // assign the value of the ending index to the starting index
            arr[j]=temp;      // assign the value of the temporary variable to the ending index
            i++;
            j--;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The reversed array is: ");
        reverseArray(arr);
    }
    
}
