public class PivotIndex {
    static int PivotIndex(int arr[]){
        int n=arr.length;    //get the length of the array
        int leftSum[]= new int[n];    //create an array to store the sum of elements to the left of each index
        int rightSum[]= new int[n];  //create an array to store the sum of elements to the right of each index


        //left sum
        leftSum[0]=arr[0];    //the first element of the left sum array is the same as the first element of the input array
        for(int i=1; i<n; i++){
            leftSum[i]=leftSum[i-1]+arr[i];    //the sum of elements to the left of the current index is equal to the sum of elements to the left of the previous index plus the current element
        }
           

        //right sum
        rightSum[n-1]=arr[n-1];    //the last element of the right sum array is the same as the last element of the input array
        for(int i=n-2; i>=0; i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }

        //find the pivot index
        for(int i=0; i<n; i++){        //traverse the array and check if the left sum is equal to the right sum at each index
            if(leftSum[i]==rightSum[i]){      //if the left sum is equal to the right sum at the current index then return the current index as the pivot index
                return i;
            }
        }

        return -1;  //return -1 if no pivot index is found
    }
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int ans=PivotIndex(arr);
        System.out.println("The pivot index of the array is: "+ans);
    }
    
}
