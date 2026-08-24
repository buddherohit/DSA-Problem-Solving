public class InsertionSort {
    static void InsertionSort(int arr[]){
        int n=arr.length;
        //itteration loop
        for(int i=1; i<n; i++){
            int curr=i;    //current index
            int prev=i-1;  //previous index
            int currentValue=arr[i];  //current value
            while(prev>=0 && currentValue<arr[prev]){    //compare the current value with the previous value and if the current value is less than the previous value then swap the values
                arr[prev+1]=arr[prev];      
                prev--; 
            }
            arr[prev+1]=currentValue;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,2,1};
        InsertionSort(arr);
        System.out.println("The Sorted element is:");
        for(int value:arr){
            System.out.println(value);
        }
    }
}
