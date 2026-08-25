public class Binarysearch {
    static int Binary(int arr[], int target){
        int n=arr.length;
        int start=0;   //start in index 0
        int end=n-1;     //end in last index
        int mid=(start+end)/2;    //calculate mid
        while (start<=end) {
            if(arr[mid]==target){    //return mid if mid==target
                return mid;
            }
            else if (target>arr[mid]) {    //move to right side
                start=mid+1;
            }
            else{         //move to left side
                end=mid-1;
            }
            mid=(start+end)/2;     //update mid because arrange array
        }
        return -1;      //not exits value
    }   
    public static void main(String[] args) {
        int arr[]={11,12,13,14,15};
        int target=12;
        int ans=Binary(arr, target);
        System.out.println(ans);
    }
}
