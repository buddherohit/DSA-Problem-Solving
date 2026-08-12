public class extremearray {
    static void extremArray(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){         //stop when the two pointers meet means i is equal to j first print the element at index i and then increment i and print the element at index j and decrement j
            if(i==j){          //if the two pointers meet then print the element at index i and return
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);          //print the element at index i and increment i
                i++;
                System.out.println(arr[j]);           //print the element at index j and decrement j
                j--;;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        System.out.println("The extreme elements of the array are: ");
        extremArray(arr);
    }
}
