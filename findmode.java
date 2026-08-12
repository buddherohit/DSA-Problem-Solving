public class findmode {
    static void findmode(int arr[]){
        int mode=arr[0];          //initialize the mode variable to the first element of the array
        int maxcount=0;              //initialize the maxcount variable to 0
        for(int i=0;i<arr.length; i++){     //iterate through the array and count the frequency of each element in the array and if the frequency of the current element is greater than the maxcount then update the mode variable to the current element and update the maxcount variable to the frequency of the current element
            int count=0;                    //intialize count as 0
            for(int j=0; j<arr.length; j++){   //iterate through the array and count the frequency of the current element
                if(arr[i]==arr[j]){          //if the current element is equal to the element at index j then increment the count variable
                    count++;               //increment the count variable
                }
            }
            if(count>maxcount){         //if the frequency of the current element is greater than the maxcount then update the mode variable to the current element and update the maxcount variable to the frequency of the current element
                maxcount=count;      //update the maxcount variable to the frequency of the current element
                mode=arr[i];             //update the mode variable to the current element
            }
        }
        System.out.println("The mode of the array is: "+mode);
        System.out.println("The maximum count of the mode is: "+maxcount);
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        findmode(arr);
    }
}
