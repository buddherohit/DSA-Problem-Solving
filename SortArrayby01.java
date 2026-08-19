public class SortArrayby01 {
    static void sortArray(int arr[]){
int n=arr.length;        //caluculate the length of the array
    int i=0;                    //initialize first pointer to the first index of the array
    int j=n-1;            // initialize second pointer to the last index of the array
    while(i<j){              //while the first pointer is less than the second pointer, iterate through the array and swap the elements at the first and second pointers if the element at the first pointer is 1 and the element at the second pointer is 0. If the element at the first pointer is 0, increment the first pointer. If the element at the second pointer is 1, decrement the second pointer.
        if(arr[i]==1 && arr[j]==0){            //if the element at the first pointer is 1 and the element at the second pointer is 0, swap the elements at the first and second pointers

            // Swap elements    
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;         //increment the first pointer
            j--;         //decrement the second pointer
            
        }
        else if(arr[i]==0){        //if the element at the first pointer is 0, increment the first pointer
            i++;
        }
        else if(arr[j]==1){       //if the element at the second pointer is 1, decrement the second pointer
            j--;
        }

    }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,1};
        sortArray(arr);
        System.out.println("Sorted array is: ");
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
