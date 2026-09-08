public class Nearlysorted {
    static int nearlySorted(int arr[], int x){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(mid-1>=start && arr[mid-1]==x){
                return mid-1;
            }
            if(mid+1<=end && arr[mid+1]==x){
                return mid+1;
            }
            if(arr[mid]>x){
                end=mid-2;
            }
            else{
                start=mid+2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10, 3, 40, 20, 50, 80, 70};
        int x=40;
        int ans=nearlySorted(arr, x);
        System.out.println("the element is found at index: " + ans);
    }
    
}
