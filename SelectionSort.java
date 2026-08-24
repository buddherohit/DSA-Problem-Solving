public class SelectionSort {
    static void SelectionSort(int arr[]){
        int n=arr.length;

        //loop for itteration and it go to n-1
        for(int i=0; i<n-1; i++){
            //assume the first element is the minimum
            int min=i;
              //loop for finding the minimum element in the unsorted array
            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[min]){
                    min=j;  //update the minimum index
                }
            }
            int temp=arr[i];  //store the first element of the unsorted array in a temporary variable
            arr[i]=arr[min];  //swap the minimum element with the first element of the unsorted array
            arr[min]=temp;    //store the first element of the unsorted array in the position of the minimum element

        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,2,1};
        SelectionSort(arr);
        System.out.println("The Sorted element is:");
        for(int value:arr){
            System.out.println(value);
        }
    }
}
