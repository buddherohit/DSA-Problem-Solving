public class Bubblesort {
    static void BubbleSort(int arr[]) {
        int n=arr.length;
       //itteration loop
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={5,6,3,2,1};
        BubbleSort(arr);
        System.out.println("The Sorted element is:");
        for(int value:arr){
            System.out.println(value);
        }

    }
    }
